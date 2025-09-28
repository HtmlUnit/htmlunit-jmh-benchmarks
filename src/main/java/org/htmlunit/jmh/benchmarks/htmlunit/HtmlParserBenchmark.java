/*
 * Copyright (c) 2002-2025 Gargoyle Software Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.htmlunit.jmh.benchmarks.htmlunit;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.htmlunit.cyberneko.HTMLConfiguration;
import org.htmlunit.cyberneko.HTMLElements;
import org.htmlunit.cyberneko.html.dom.HTMLDocumentImpl;
import org.htmlunit.cyberneko.parsers.DOMParser;
import org.htmlunit.cyberneko.parsers.SAXParser;
import org.htmlunit.cyberneko.xerces.xni.XNIException;
import org.htmlunit.cyberneko.xerces.xni.parser.XMLInputSource;
import org.htmlunit.cyberneko.xerces.xni.parser.XMLParserConfiguration;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.infra.BenchmarkParams;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/**
 * @authorRené Schwietzke
 * @author Ronald Brill
 */
@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations = 5, time = 3, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 3, time = 5, timeUnit = TimeUnit.SECONDS)
@Fork(1)
public class HtmlParserBenchmark {
    private static final String simpleFile = "src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/simple.html";
    private static final String smallFile = "src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/small-xc-homepage.html";
    private static final String mediumFile = "src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/wikipedia-de-hp.html";
    private static final String largeFile = "src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/puma-de-hp.html";

    @Param({simpleFile, smallFile, mediumFile, largeFile})
    String file;

    private static final HTMLElements htmlElements = new HTMLElements();

    @Setup
    public void setup(BenchmarkParams params) throws IOException {
    }

    @Benchmark
    public XMLParserConfiguration simpleParser() throws XNIException, IOException {
        final XMLParserConfiguration parser = new HTMLConfiguration(htmlElements);
        parser.parse(new XMLInputSource(null, file, null));

        return parser;
    }

//    @Benchmark
//    public XMLParserConfiguration simpleParserWithCache() throws XNIException, IOException {
//        final XMLParserConfiguration parser = new HTMLConfiguration(new HTMLElements.HTMLElementsWithCache(htmlElements));
//        parser.parse(new XMLInputSource(null, file, null));
//
//        return parser;
//    }
//
    @Benchmark
    public SAXParser saxParser() throws XNIException, IOException {
        // final SAXParser parser = new SAXParser(htmlElements);
        final SAXParser parser = new SAXParser();

        ContentHandler myContentHandler = new NoOpContentHandler();
        parser.setContentHandler(myContentHandler);

        parser.parse(new XMLInputSource(null, file, null));

        return parser;
    }

//    @Benchmark
//    public SAXParser saxParserWithCache() throws XNIException, IOException {
//        final SAXParser parser = new SAXParser(new HTMLElements.HTMLElementsWithCache(htmlElements));
//
//        ContentHandler myContentHandler = new NoOpContentHandler();
//        parser.setContentHandler(myContentHandler);
//
//        parser.parse(new XMLInputSource(null, file, null));
//
//        return parser;
//    }

    @Benchmark
    public DOMParser domParser() throws XNIException, IOException {
        final DOMParser parser = new DOMParser(HTMLDocumentImpl.class);
        XMLInputSource src = new XMLInputSource(null, file, null);
        src.setEncoding("UTF-8");
        parser.parse(src);

        return parser;
    }

//    @Benchmark
//    public DOMParser domParserWithCache() throws XNIException, IOException {
//        final DOMParser parser = new DOMParser(new HTMLElements.HTMLElementsWithCache(htmlElements), HTMLDocumentImpl.class);
//        XMLInputSource src = new XMLInputSource(null, file, null);
//        src.setEncoding("UTF-8");
//        parser.parse(src);
//
//        return parser;
//    }

    public static void main(String[] args) throws RunnerException
    {
        Options opt = new OptionsBuilder()
                // important, otherwise we will run all tests!
                .include(HtmlParserBenchmark.class.getSimpleName() + ".domParser")
                // 0 is needed for debugging, not for running
                .forks(0)
                .build();

        new Runner(opt).run();
    }

    private static class NoOpContentHandler implements ContentHandler {
        @Override
        public void startPrefixMapping(final String prefix, final String uri) throws SAXException {
        }

        @Override
        public void startElement(final String uri, final String localName, final String qName, final Attributes atts) throws SAXException {
        }

        @Override
        public void startDocument() throws SAXException {
        }

        @Override
        public void skippedEntity(final String name) throws SAXException {
        }

        @Override
        public void setDocumentLocator(final Locator locator) {
        }

        @Override
        public void processingInstruction(final String target, final String data) throws SAXException {
        }

        @Override
        public void ignorableWhitespace(final char[] ch, final int start, final int length) throws SAXException {
        }

        @Override
        public void endPrefixMapping(final String prefix) throws SAXException {
        }

        @Override
        public void endElement(final String uri, final String localName, final String qName) throws SAXException {
        }

        @Override
        public void endDocument() throws SAXException {
        }

        @Override
        public void characters(final char[] ch, final int start, final int length) throws SAXException {
        }
    }
}

