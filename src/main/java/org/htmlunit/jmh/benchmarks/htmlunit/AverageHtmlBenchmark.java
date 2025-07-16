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

import java.util.concurrent.TimeUnit;

import org.htmlunit.BrowserVersion;
import org.htmlunit.WebClient;
import org.htmlunit.html.HtmlPage;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

@State(Scope.Thread)
@Fork(1)
public class AverageHtmlBenchmark {

    String html = """
<!DOCTYPE html>
<html lang="en">
        <head>
        <meta charset="utf-8">
        <meta http-equiv="content-type" content="text/html;charset=UTF-8">

        <title>Xceptance - The Software Testing Experts</title>

        
        
            <meta name="description" content="Xceptance, the software testing experts.">
        

        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        
        <meta name="robots" content="index,follow" />
        

        <link rel="alternate" type="application/rss+xml" title="RSS" href="https://www.xceptance.com/en/feed.xml">

        
        

        

        
            <link rel="canonical" href="https://www.xceptance.com/en/" />

            <!-- link to alternate version language wise -->
            <!-- follows https://developers.google.com/search/docs/specialty/international/localized-versions#html -->
            <link rel="alternate" hreflang="en" href="https://www.xceptance.com/en/" />
            <link rel="alternate" hreflang="de" href="https://www.xceptance.com/de/" />
        


        <!-- Icon -->
        <link rel="apple-touch-icon" sizes="180x180" href="/apple-touch-icon.png?1751034983">
        <link rel="icon" type="image/png" sizes="32x32" href="/favicon-32x32.png?1751034983">
        <link rel="icon" type="image/png" sizes="16x16" href="/favicon-16x16.png?1751034983">
        <link rel="icon" size="any" href="/favicon.svg?1751034983">
        <link rel="manifest" href="/site.webmanifest?1751034983">

        <!-- prefetch fonts -->
        <link rel="preload" href="/fonts/MaterialSymbolsOutlined.woff2" as="font" type="font/woff2" crossorigin>
        <link rel="preload" href="/fonts/Roboto-Light.woff2" as="font" type="font/woff2" crossorigin>
        <link rel="preload" href="/fonts/Roboto-Regular.woff2" as="font" type="font/woff2" crossorigin>
        <link rel="preload" href="/fonts/RobotoCondensed-Light.woff2" as="font" type="font/woff2" crossorigin>
        <link rel="preload" href="/fonts/RobotoCondensed-Regular.woff2" as="font" type="font/woff2" crossorigin>

        <!-- Google Fonts -->
        <link href="/css/roboto.css?1751034983" rel="stylesheet">
        <link href="/css/material-symbols.css?1751034983" rel="stylesheet">
        <link href="/css/xceptance.css?1751034983" rel="stylesheet" media="all">

        <script defer src="/js/jquery-3.7.1.slim.min.js"></script>
        <script defer src="/js/bootstrap.min.js?1751034983"></script>
        <script defer src="/js/js.cookie.min.js"></script>

        <!-- Plausible Analystics -->
        <script defer data-domain="xceptance.com" src="https://plausible.io/js/script.outbound-links.js"></script>
        <script>window.plausible = window.plausible || function() { (window.plausible.q = window.plausible.q || []).push(arguments) }</script>

        <!-- handle header offset -->
        <script defer>
            window.onload = function() {
                if (window.location.hash) {
                    const targetId = window.location.hash.substring(1); // Remove the '#'
                    const targetElement = document.getElementById(targetId);
                    const headerOffset = 90;

                    if (targetElement) {
                        // get the hash position
                        const targetPosition = targetElement.getBoundingClientRect().top + window.pageYOffset;

                        // "open" page on top
                        window.scrollTo(0, 0);

                        // scroll to hash
                        window.scrollTo({
                            top: targetPosition - headerOffset,
                            behavior: 'smooth'
                        });
                    }
                }
            };
        </script>

        <script type="application/ld+json">
        {
            "@context": "http://schema.org",
            "@type": "Corporation",
            "url": "https://www.xceptance.com/",
            "name": "Xceptance",
            "legalName": "Xceptance Software Technologies GmbH",
            "brand": {
                "@type": "Brand",
                "name": "Xceptance"
            },
            "sameAs": [
                "https://www.xing.com/companies/xceptancesoftwaretechnologiesgmbh",
                "https://www.linkedin.com/company/xceptance/",
                "https://blog.xceptance.com/",
                "https://twitter.com/Xceptance"
            ],
            "logo": "https://www.xceptance.com/resources/press/xceptance-logo-transparent-1970x459.png",
            "contactPoint": [{
                "@type": "ContactPoint",
                "telephone": "+49-3641-376300",
                "contactType": "customer service"
            }],

            "location": {
                "@type": "PostalAddress",
                "streetAddress": "Leutragraben 2-4",
                "addressLocality": "Jena",
                "addressRegion": "Thüringen",
                "postalCode": "07743",
                "addressCountry": "Germany"
            },

            "department" : [
            {
                "@type": "Corporation",
                "url": "https://www.xceptance.com/de",
                "name": "Xceptance GmbH",
                "legalName": "Xceptance Software Technologies GmbH",
                "email": "kontakt(at)xceptance.de",
                "address": {
                   "@type": "PostalAddress",
                   "streetAddress": "Leutragraben 2-4",
                   "addressLocality": "Jena",
                   "addressRegion": "Thüringen",
                   "postalCode": "07743",
                   "addressCountry": "Germany"
                 },
                 "vatID": "DE 235 305 262"
            },
            {
                "@type": "Corporation",
                "url": "https://www.xceptance.com/en",
                "name": "Xceptance IOc.",
                "legalName": "Xceptance Software Technologies Inc.",
                "email": "contact(at)xceptance.com",
                 "address": {
                    "@type": "PostalAddress",
                    "streetAddress": "130 Bishop Allen Drive",
                    "addressLocality": "Cambridge",
                    "addressRegion": "MA",
                    "postalCode": "02139",
                    "addressCountry": "United States"
                 },
                 "contactPoint": [{
                     "@type": "ContactPoint",
                     "telephone": "+1-617-880-9898",
                     "contactType": "customer service",
                     "areaServed" : ["US", "CA"]
                 }]
            }
            ]
        }
        </script>
    </head>


    <body class="homepage local-scroll" id="page">
        <!-- container centers things -->
        <div id="navigation" class="navbar-fixed-top">
            <div class="container">
                <nav class="navbar navbar-default navbar-fixed-top" role="navigation" id="navigation">
    <div class="container">

        <div class="navbar-header">
            <div class="navbar-brand navbar-left">
                <a rel="home" href="/en/" alt="Back to the Homepage">
                    <img src="/images/xceptance-software-technologies-logo.svg"
                    title="The Xceptance Company and Brand Logo"
                    alt="The word XCEPTANCE in a gray, with a bright red X superimposed over the first part of the word.
" />
                </a>
            </div>
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
        </div>


        <div class="collapse navbar-collapse">
            <div id="language-switcher">
                

                
                
                
                <span class="language"><a href="/de/">DEUTSCH</a></span>&nbsp;&nbsp;<span class="language active">ENGLISH</span>
                
                
            </div>


            <ul class="nav navbar-nav pull-right">
                
                    
                    
                        
                        







<li class="dropdown">
    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Services<span class="caret-new"></span></a>
    <ul class="dropdown-menu">
        
            
                <li>






    

    



    

    



    

    



    

    



    

    



    

    



    

    

        
        

        
            <a href="/en/services/">Overview</a>
        
    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    


</li>
            
        
            
                <li>






    

    



    

    

        
        

        
            <a href="/en/services/accessibility-testing/">Accessibility</a>
        
    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    


</li>
            
        
            
                <li>






    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    

        
        

        
            <a href="/en/services/security-testing/">Security</a>
        
    



    

    



    

    



    

    



    

    



    

    


</li>
            
        
            
                <li>






    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    

        
        

        
            <a href="/en/services/salesforce-commerce-cloud-testing/">Salesforce Commerce Cloud</a>
        
    



    

    



    

    



    

    



    

    



    

    



    

    


</li>
            
        
    </ul>

</li>

                    

                
                    
                    
                        
                        







<li class="dropdown">
    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Products<span class="caret-new"></span></a>
    <ul class="dropdown-menu">
        
            
                <li>






    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    

        
        

        
            <a href="/en/products/">Overview</a>
        
    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    


</li>
            
        
            
                <li>






    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    

        
        

        
            <a href="/en/products/xtc/">Test Center - XTC</a>
        
    


</li>
            
        
            
                <li>






    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    

        
        

        
            <a href="/en/products/xlt/">Load Test - XLT</a>
        
    



    

    


</li>
            
        
            
                <li>






    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    

        
        

        
            <a href="/en/products/neodymium/">Neodymium</a>
        
    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    


</li>
            
        
    </ul>

</li>

                    

                
                    
                    
                        
                        







<li class="dropdown">
    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Company<span class="caret-new"></span></a>
    <ul class="dropdown-menu">
        
            
                <li>






    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    

        
        

        
            <a href="/en/company/">About Us</a>
        
    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    


</li>
            
        
            
                <li>






    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    

        
        

        
            <a href="/en/company/management/">Management</a>
        
    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    


</li>
            
        
            
                <li>






    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    

        
        

        
            <a href="/en/company/team/">Team</a>
        
    



    

    



    

    



    

    


</li>
            
        
            
                <li>






    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    

        
        

        
            <a href="/en/company/references/">References</a>
        
    



    

    



    

    



    

    



    

    



    

    



    

    



    

    


</li>
            
        
            
                <li>






    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    

        
        

        
            <a href="/en/company/press/">Press</a>
        
    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    


</li>
            
        
    </ul>

</li>

                    

                
                    
                    
                        
                        







<li class="dropdown">
    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">News<span class="caret-new"></span></a>
    <ul class="dropdown-menu">
        
            
                <li>






    

    



    

    



    

    



    

    



    

    



    

    

        
        

        
            <a href="/en/news/">Latest</a>
        
    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    


</li>
            
        
            
                <li>






    

    



    

    



    

    

        
        

        
            <a href="/en/news/archive/">Archive</a>
        
    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    


</li>
            
        
    </ul>

</li>

                    

                
                    
                    
                        
                        







<li class="dropdown">
    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Contact<span class="caret-new"></span></a>
    <ul class="dropdown-menu">
        
            
                <li>






    

    



    

    



    

    



    

    



    

    

        
        

        
            <a href="/en/contact/">General</a>
        
    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    


</li>
            
        
            
                <li>






    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    

        
        

        
            <a href="/en/privacy/">Privacy</a>
        
    



    

    



    

    



    

    



    

    



    

    



    

    



    

    



    

    


</li>
            
        
    </ul>

</li>

                    

                
                    
                    
                        <li><a target="_blank" rel="noopener noreferrer" href="https://blog.xceptance.com/">Blog</a></li>
                    

                
            </ul>


        </div> <!-- from collapse div -->

    </div> <!-- from container div -->
</nav>

            </div>
        </div>

        <header id="teaser">
            <div class="container">
                <div class="row">
                    <div class="text-center col-sm-12">
                        <h1>We Test Software.<br/>Because Quality Matters.</h1>
                    </div>
                </div>
            </div>
        </header>

        <div class="container-fluid" id="notification-bar">
    <div class="row">
        <div class="col-sm-12">
            <p>
                <a href="/en/services/accessibility-testing/" class="more">+ + + WCAG 2025 is Approaching - Ensure Your Compliance Now! + + +
</a>
            </p>
        </div>
    </div>
</div>

<div id="main" class="container-fluid">
    <div id="introduction" class="row intro">
        <div class="container">
            <div class="row">
                <div class="text-center col-md-offset-1 col-md-10">
                    <h1>Committed to Software Quality</h1>
                    <p class="lead">We Help Our Clients Optimize Software Testing and Quality Assurance.</p>
                </div>
            </div>
        </div>
    </div>

    <div class="row strip bg-dark">
        <div class="container">
            <div class="row large-divider no-pb">
                <div class="col-md-offset-1 col-md-10 text-center">
                    <h2>What We Offer</h2>
                    <p class="lead">Services, Consulting, and Tool Offerings.</p>
                </div>
            </div>

            <div class="row no-pt">
                <div class="col-sm-6 tile">
                    <div class="icon"><span class="mso">bug_report</span></div>
                    <h2><a href="/en/services/#functional-testing">Manual &amp; Automated Testing</a></h2>
                    <p class="explanation">
                        We test your product based on individual requirements using an ideal mix of manual and automated testing.
                        <a href="/en/services/#functional-testing" class="more">Learn&nbsp;More&nbsp;&gt;&gt;</a>
                    </p>
                </div>

                <div class="col-sm-6 tile">
                    <div class="icon"><span class="mso">delivery_truck_speed</span></div>
                    <h2><a href="/en/services/#performance-testing">Load &amp; Performance Testing</a></h2>
                    <p class="explanation">
                        We simulate the traffic you expect on your platform and deliver detailed test reports for both web and API testing. Discover how your site truly performs on both the server and client sides.
                        <a href="/en/services/#performance-testing" class="more">Learn&nbsp;More&nbsp;&gt;&gt;</a>
                    </p>
                </div>
            </div>

            <div class="row">
                <div class="col-sm-6 tile">
                    <div class="icon"><span class="mso">explore</span></div>
                    <h2><a href="/en/services/#test-guidance">Test Guidance &amp; Support</a></h2>
                    <p class="explanation">
                        We love to share our knowledge and can help you establish or improve your own quality assurance processes. Let us inspire you to test better!
                        <a href="/en/services/#test-guidance" class="more">Learn&nbsp;More&nbsp;&gt;&gt;</a>
                    </p>
                </div>

                <div class="col-sm-6 tile">
                    <div class="icon"><span class="mso">handyman</span></div>
                    <h2><a href="/en/products/">Testing Tools</a></h2>
                    <p class="explanation">
                        We offer tools for load testing, monitoring, and functional test automation of web applications.
                        <a href="/en/products/" class="more">Learn&nbsp;More&nbsp;&gt;&gt;</a>
                    </p>
                </div>
            </div>
        </div>
    </div>

    <div class="row fixed-background">
        <div class="container">
            <div class="row">
                <!-- supposed to be empty -->
            </div>
        </div>
    </div>

    <div class="row strip bg-transparent">
        <div class="container">
            <div class="row large-divider no-pb">
                <div class="col-md-offset-1 col-md-10 text-center">
                    <h2>Why Choose Us?</h2>
                    <p class="lead">What Makes Us Stand Out.</p>
                </div>
            </div>

            <div class="row no-pt">
                <div class="col-sm-6 tile">
                    <h2>Specialized Expertise</h2>
                    <p class="explanation">
                        We are fully specialized in software quality assurance. This focus enables precise and effective test solutions that ensure the highest standards of quality and reliability in every project.
                    </p>
                </div>

                <div class="col-sm-6 tile">
                    <h2>Flexible and Scalable</h2>
                    <p class="explanation">
                        Whether it’s agile teams, traditional methodologies, or large enterprise projects, we adapt flexibly to your needs. We work with your tools or ours and handle projects of any size, from a few person-days to several thousand.
                    </p>
                </div>
            </div>

            <div class="row">
                <div class="col-sm-6 tile">
                    <h2>Experience and Efficiency</h2>
                    <p class="explanation">
                        With over 20 years of experience, we offer efficient solutions, direct communication, and quick response times. We have successfully tested in more than 1500 projects for over 500 clients worldwide, providing reliable results.
                    </p>
                </div>

                <div class="col-sm-6 tile">
                    <h2>High-Quality Testing</h2>
                    <p class="explanation">
                        Our experienced test engineers hold degrees in Computer Science or Business Informatics, or possess equivalent qualifications. This enables a deeper understanding and ensures high-quality testing.
                    </p>
                </div>
            </div>

            <div class="row">
                <div class="col-sm-6 tile">
                    <h2>Trust</h2>
                    <p class="explanation">
                        We strive for fair, long-term relationships with our clients and partners, and build stable, trustworthy teams for every project. We prioritize integrity and open communication so that cooperation is based on mutual respect and understanding.
                    </p>
                </div>
                <div class="col-sm-6 tile">
                    <h2>Global Client Support</h2>
                    <p class="explanation">
                        We are fluent in German and English, with additional proficiency in Arabic, French, Italian, Romanian, Spanish, and Ukrainian. This allows us to support clients worldwide without communication barriers.
                    </p>
                </div>
            </div>
        </div>
    </div>

    <div class="row fixed-background">
        <div class="container">
            <div class="row">
                <div class="col-sm-9">
                    <p class="lead">
                        Welcome to Xceptance!<br/>Get to know us. <a href="/en/company/"><span class="mso mso-3x">chevron_right</span></a>
                    </p>
                </div>
            </div>
        </div>
    </div>
</div>


        <footer>
            <div class="container-fluid" id="footer-information">
    <div class="container">
        <div class="row">
            <div class="col-xs-6 col-sm-3" id="addresses">
                <div class="footer-contact">
                    <h3>Jena, Germany <span class="meta">Headquarters</span></h3>
                    <div class="vcard">
                        <div class="fn org">Xceptance GmbH</div>
                        <div class="email"><span class="mso">mail</span> kontakt@xceptance.de</div>
                        <div class="tel"><span class="mso">phone</span> <span class="type">work</span>+49-3641-376300</div>
                        <div class="note">Headquarters and European Subsidiary</div>
                    </div>
                </div>
                <div class="footer-contact">
                    <h3>Cambridge, MA, USA</h3>
                    <div class="vcard">
                        <div class="fn org">Xceptance Inc.</div>
                        <div class="email"><span class="mso">mail</span> contact@xceptance.com</div>
                        <div class="tel"><span class="mso">phone</span> <span class="type">work</span>+1-617-880-9898</div>
                        <div class="note">North American Subsidiary</div>
                    </div>
                </div>
            </div>
            <div class="col-xs-5 col-xs-offset-1 col-sm-2 col-sm-offset-1">
                <ul>
                    <li><a href="/en/company/">About Us</a></li>
                    <li><a href="/en/contact/">Contact</a></li>
                    <li><a href="/en/services/">Services</a></li>
                    <li><a href="/en/products/">Products</a></li>
                    <li><a href="/en/company/references/">References</a></li>
                    <li><a href="/en/privacy/">Privacy</a></li>
                </ul>
            </div>
            <!-- Add the extra clearfix for only the required viewport -->
            <div class="clearfix visible-xs-block"></div>
            <div class="col-xs-6 col-sm-2">
                <ul>
                    <!-- to save on another font load, we embed the SVG directly -->
                    <li><a href="https://blog.xceptance.com/" target="_blank" rel="noopener noreferrer"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-pen-fill" viewBox="0 0 16 16">
  <path d="m13.498.795.149-.149a1.207 1.207 0 1 1 1.707 1.708l-.149.148a1.5 1.5 0 0 1-.059 2.059L4.854 14.854a.5.5 0 0 1-.233.131l-4 1a.5.5 0 0 1-.606-.606l1-4a.5.5 0 0 1 .131-.232l9.642-9.642a.5.5 0 0 0-.642.056L6.854 4.854a.5.5 0 1 1-.708-.708L9.44.854A1.5 1.5 0 0 1 11.5.796a1.5 1.5 0 0 1 1.998-.001"/>
</svg>Blog</a></li>
<li><a href="https://www.xing.com/companies/xceptancesoftwaretechnologiesgmbh" target="_blank" rel="noopener noreferrer"><svg fill="currentColor" xmlns="http://www.w3.org/2000/svg"
     width="16" height="16" viewBox="0 0 540.543 540.543">
<g>
    <g>
        <path d="M129.989,378.772c8.274,0,15.361-5.006,21.243-15.036c53.813-95.423,81.806-145.093,83.991-149.028l-53.593-93.458
            c-5.667-9.804-12.858-14.707-21.567-14.707H81.953c-5.019,0-8.495,1.634-10.459,4.902c-2.399,3.268-2.289,7.301,0.325,12.087
            l52.613,91.176c0.214,0.232,0.214,0.331,0,0.331L41.75,361.453c-2.172,4.149-2.172,8.066,0,11.757
            c2.173,3.715,5.557,5.562,10.129,5.562H129.989z"/>
        <path d="M488.492,0h-78.758c-8.495,0-15.472,4.902-20.912,14.707C277.053,212.97,219.206,315.596,215.283,322.555l110.784,203.282
            c5.227,9.804,12.418,14.706,21.567,14.706h78.104c4.791,0,8.28-1.634,10.459-4.902c2.172-3.715,2.068-7.748-0.325-12.099
            L326.073,322.555v-0.318L498.627,16.995c2.393-4.571,2.393-8.592,0-12.087C496.662,1.634,493.284,0,488.492,0z"/>
    </g>
</g>
</svg>Xing</a></li>
                    <li><a href="https://www.linkedin.com/company/xceptance" target="_blank" rel="noopener noreferrer"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-linkedin" viewBox="0 0 16 16">
  <path d="M0 1.146C0 .513.526 0 1.175 0h13.65C15.474 0 16 .513 16 1.146v13.708c0 .633-.526 1.146-1.175 1.146H1.175C.526 16 0 15.487 0 14.854zm4.943 12.248V6.169H2.542v7.225zm-1.2-8.212c.837 0 1.358-.554 1.358-1.248-.015-.709-.52-1.248-1.342-1.248S2.4 3.226 2.4 3.934c0 .694.521 1.248 1.327 1.248zm4.908 8.212V9.359c0-.216.016-.432.08-.586.173-.431.568-.878 1.232-.878.869 0 1.216.662 1.216 1.634v3.865h2.401V9.25c0-2.22-1.184-3.252-2.764-3.252-1.274 0-1.845.7-2.165 1.193v.025h-.016l.016-.025V6.169h-2.4c.03.678 0 7.225 0 7.225z"/>
</svg>LinkedIn</a></li>
<li><a href="https://github.com/Xceptance/" target="_blank" rel="noopener noreferrer"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-github" viewBox="0 0 16 16">
<path d="M8 0C3.58 0 0 3.58 0 8c0 3.54 2.29 6.53 5.47 7.59.4.07.55-.17.55-.38 0-.19-.01-.82-.01-1.49-2.01.37-2.53-.49-2.69-.94-.09-.23-.48-.94-.82-1.13-.28-.15-.68-.52-.01-.53.63-.01 1.08.58 1.23.82.72 1.21 1.87.87 2.33.66.07-.52.28-.87.51-1.07-1.78-.2-3.64-.89-3.64-3.95 0-.87.31-1.59.82-2.15-.08-.2-.36-1.02.08-2.12 0 0 .67-.21 2.2.82.64-.18 1.32-.27 2-.27s1.36.09 2 .27c1.53-1.04 2.2-.82 2.2-.82.44 1.1.16 1.92.08 2.12.51.56.82 1.27.82 2.15 0 3.07-1.87 3.75-3.65 3.95.29.25.54.73.54 1.48 0 1.07-.01 1.93-.01 2.2 0 .21.15.46.55.38A8.01 8.01 0 0 0 16 8c0-4.42-3.58-8-8-8"/>
</svg>GitHub</a></li>
                </ul>
            </div>
            <div class="col-xs-6 col-sm-4" id="news-section">
                <h3>Latest News</h3>

                
                <p class="meta newsdate">10 June 2025</p>
                <p><a href="/en/news/2025-06-10-xlt-9-java-21-support-and-enhanced-reports.html">XLT 9.0: Enhanced Reports and Java 21 Support</a></p>
                
                <p class="meta newsdate">12 May 2025</p>
                <p><a href="/en/news/2025-05-12-load-testing-ticket-sales-for-Wacken-Open-Air.html">Load Testing Ticket Sales for the Wacken Open Air – Case Study</a></p>
                
                <p class="meta newsdate">17 April 2025</p>
                <p><a href="/en/news/2025-04-17-writing-another-load-test-tool-xlt-xceptance-german-testing-day.html">Writing another load test tool? What a stupid idea!</a></p>
                
            </div>
        </div>
    </div>
</div>

<div class="container-fluid" id="copyright">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <p>
                    &copy; Copyright Xceptance 2011-2025
                </p>
            </div>
        </div>
    </div>
</div>

        </footer>
        <!-- avoid whitespaces -->
<div id="top-scroller"><a href="/en/#page" aria-label="Jump back to the top of the page"><span class="mso" aria-hidden="true">keyboard_arrow_up</span></a></div>

        
        <div class="container">
    <div class="row">
        <div class="col-sm-10 col-sm-offset-1 col-md-8 col-md-offset-2 col-lg-6 col-lg-offset-3 alert alert-info alert-dismissable" id="privacy-message" style="display: none;">
            <h3>With Us, Privacy Is All Yours.</h3>
            <p>
    We prioritize your privacy. While we log essential metadata, such as anonymised IP addresses, browser information, and website usage, to ensure functionality and security, we explicitly do not collect data for tracking purposes.
</p> <p>
    To enhance your browsing experience, we use a non-personalized cookie to remember that you've already viewed this banner. Also, we use the privacy friendly Plausible Analytics, which is fully <a href="https://plausible.io/privacy-focused-web-analytics">GDPR-compliant</a>.
</p> <p>
    You can find more information in our <a href="/en/privacy/">privacy section</a>.
</p>


            <p class="text-right">
                <button type="button" class="btn btn-primary" onclick="$('#privacy-message').hide();">
                    Understood
                </button>
            </p>
        </div>
    </div>
</div>

        <script defer>
    // display the privacy message when not yet displayed, store this fact in a cookie
    window.onload = function() {
        if (Cookies.get('privacy-msg-displayed') == undefined) {
            $('#privacy-message').show();
            Cookies.set('privacy-msg-displayed', 'true', { expires: 7, path: '/en' });
        };
    };
</script>

    </body>
</html>
            """;

    WebClient webClient;

    @Setup
    public void setup() {
        webClient = new WebClient(BrowserVersion.getDefault(), false, null, -1);
        webClient.getOptions().setJavaScriptEnabled(false);
        webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
        webClient.getOptions().setCssEnabled(false);
        webClient.getOptions().setHistoryPageCacheLimit(0);
        webClient.getOptions().setHistorySizeLimit(0);
        webClient.getOptions().setWebSocketEnabled(false);
        webClient.setFrameContentHandler(baseFrameElement -> false);
    }
 
    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @Warmup(iterations = 5, time = 2, timeUnit = TimeUnit.SECONDS)
    @Measurement(iterations = 3, time = 5, timeUnit = TimeUnit.SECONDS)
    public HtmlPage averageHtml() throws Exception {
        return webClient.loadHtmlCodeIntoCurrentWindow(html);
    }
    
    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(AverageHtmlBenchmark.class.getSimpleName()) // Or a regex to include multiple benchmarks
                
                .forks(0) // Set to 0 for debugging in the same JVM, but avoid for actual benchmarking
                .build();

        new Runner(opt).run();
    }
}

