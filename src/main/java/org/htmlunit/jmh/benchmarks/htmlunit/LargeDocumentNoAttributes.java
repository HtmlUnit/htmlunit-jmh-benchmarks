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

@State(Scope.Thread)
@Fork(5)
public class LargeDocumentNoAttributes {

    String html = """
            <html>
            <head>
            </head>
            <body>
            <div>
              <!-- navigation placeholders -->
              <div>
                <div>
                </div>
                <div>
                </div>
                <div>
                </div>
                <div>
                </div>
              </div>
              <div>
                <div>
                  <div>
                    <div>
                      <div>
                        <div>
                          <h>
                      <span>
                       Stella Levinson
                      </span>
                          </h1>
                        </div>
                        <div>
                          <h>
                      <span>
                       Project manager
                      </span>
                        <span>
                       Project manager
                      </span>
                        <span>
                       Project manager
                      </span>  <span>
                       Project manager
                      </span>


                          </h4>
                        </div>
                        <div>
                          <h>
                      <span>
                       Looking for my next opportunity to make a change. The digital way.
                      </span>
                          </h4>
                        </div>
                        <div>
                          <div>
                            <div>
                              <a>
                        <span>
                         <span>
                         </span>
                        </span>
                                <span>
                         SEE RESUME
                        </span>
                              </a>
                            </div>
                            <div>
                              <a>
                        <span>
                         <span>
                         </span>
                        </span>
                                <span>
                         CONTACT ME
                        </span>
                              </a>
                            </div>
                            <div>
                              <div>
                              </div>
                            </div>
                          </div>
                        </div>
                      </div>
                      <div>
                        <div>
                          <a>
                            <img>
                          </a>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div>
                    <div>
                      <div>
                        <div>
                          <img>
                        </div>
                      </div>
                      <div>
                        <div>
                          <h>
                      <span>
                       I advise companies and NGOs in initiatives and campaigns
                      </span>
                          </h2>
                        </div>
                        <div>
                          <p>
                      <span>
                       For more than 15 years, I've been working with international clients on a range of projects, gathering experience in diverse areas. I look forward to hearing about your project and plan its success together.&nbsp;
                      </span>
                          </p>
                        </div>
                        <a>
                     <span>
                      <span>
                      </span>
                     </span>
                          <span>
                      SEE RESUME
                     </span>
                        </a>
                      </div>
                    </div>
                  </div>
                  <div>
                    <div>
                      <div>
                        <div>
                          <h>
                      <span>
                       Recommendations
                      </span>
                          </h2>
                        </div>
                        <div>
                          <div>
                            <ul>
                              <li>
                                <img>
                                <div>
                                </div>
                                <div>
                                  <div>
                                    <h>
                                    </h3>
                                    <div>
                                      <p>
                                        Working with Stella was an unforgettable experience! She is insightful, engaging and full of energy. She had an incredible impact on the project.&nbsp;
                                      </p>
                                    </div>
                                  </div>
                                  <div>
                          <span>
                           <span>
                           </span>
                          </span>
                                    <span>
                           Dana Rosen | Nickel
                          </span>
                                  </div>
                                </div>
                              </li>
                              <li>
                                <img>
                                <div>
                                </div>
                                <div>
                                  <div>
                                    <h>
                                      Slide title
                                    </h3>
                                    <div>
                                      <p>
                                        Working with Stella was an unforgettable experience! She is insightful, engaging and full of energy. She had an incredible impact on the project.&nbsp;
                                      </p>
                                    </div>
                                  </div>
                                  <div>
                          <span>
                           <span>
                           </span>
                          </span>
                                    <span>
                           John Taylor | Tuesday
                          </span>
                                  </div>
                                </div>
                              </li>
                              <li>
                                <img>
                                <div>
                                </div>
                                <div>
                                  <div>
                                    <h>
                                      Slide title
                                    </h3>
                                    <div>
                                      <p>
                                        Working with Stella was an unforgettable experience! She is insightful, engaging and full of energy. She had an incredible impact on the project.&nbsp;
                                      </p>
                                    </div>
                                  </div>
                                  <div>
                          <span>
                           <span>
                           </span>
                          </span>
                                    <span>
                           Rina Brick | Eletrics
                          </span>
                                  </div>
                                </div>
                              </li>
                            </ul>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div>
                    <div>
                      <div>
                        <div>
                          <h>
                      <span>
                       Work Experience
                      </span>
                          </h1>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div>
                    <div>
                      <div>
                        <div>
                          <h>
                      <span>
                       2020-2021
                      </span>
                          </h5>
                        </div>
                        <div>
                          <h>
                      <span>
                       Advisor, South Company
                      </span>
                          </h4>
                        </div>
                      </div>
                      <div>
                        <div>
                          <p>
                      <span>
                       In this position, I led a team of more than 40 professional and volunteer staff members, from various company departments.&nbsp;
                      </span>
                            <span>
                       <span>
                       </span>
                      </span>
                          </p>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div>
                    <div>
                      <div>
                        <div>
                          <h>
                      <span>
                       2019-2020
                      </span>
                          </h5>
                        </div>
                        <div>
                          <h>
                      <span>
                       Consultant, North Company
                      </span>
                          </h4>
                        </div>
                      </div>
                      <div>
                        <div>
                          <p>
                      <span>
                       In this position, I led a team of more than 40 professional and volunteer staff members, from various company departments.&nbsp;
                      </span>
                          </p>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div>
                    <div>
                      <div>
                        <div>
                          <h>
                      <span>
                       2018-2019
                      </span>
                          </h5>
                        </div>
                        <div>
                          <h>
                      <span>
                       Project manager, East Company
                      </span>
                          </h4>
                         <div>
                          <h>
                      <span>
                       Project manager, East Company
                      </span>
                          </h4>
                           <h>
                      <span>
                       Project manager, East Company
                      </span>
                          </h4>
                           <h>
                      <span>
                       Project manager, East Company
                      </span>
                          </h4>
                           <h>
                      <span>
                       Project manager, East Company
                      </span>
                          </h4>
                           <h>
                      <span>
                       Project manager, East Company
                      </span>
                          </h4>
                        </div>


                        </div>
                      </div>
                      <div>
                        <div>
                          <p>
                      <span>
                       <span>
                        In this position, I led a team of more than 40 professional and volunteer staff members, from various company departments.
                       </span>
                      </span>
                          </p>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div>
                    <div>
                      <div>
                        <div>
                          <hr>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div>
                    <div>
                      <div>
                        <div>
                          <h>
                      <span>
                       Education
                      </span>
                          </h2>
                        </div>
                      </div>
                      <div>
                        <div>
                          <h>
                      <span>
                       2014-2018
                      </span>
                          </h5>
                        </div>
                        <div>
                          <h>
                      <span>
                       New York University
                      </span>
                          </h4>
                        </div>
                        <div>
                          <p>
                      <span>
                       <span>
                        MBA in International Studies and Economics
                       </span>
                      </span>
                         <span>
                       <span>
                        MBA in International Studies and Economics
                       </span>
                      </span>
                         <span>
                       <span>
                        MBA in International Studies and Economics
                       </span>
                      </span>
                         <span>
                       <span>
                        MBA in International Studies and Economics
                       </span>
                      </span>
                         <span>
                       <span>
                        MBA in International Studies and Economics
                       </span>
                      </span>
                         <span>
                       <span>
                        MBA in International Studies and Economics
                       </span>
                      </span>
                         <span>
                       <span>
                        MBA in International Studies and Economics
                       </span>
                      </span>
                         <span>
                       <span>
                        MBA in International Studies and Economics
                       </span>
                      </span>   <span>
                       <span>
                        MBA in International Studies and Economics
                       </span>
                      </span>
                         <span>
                       <span>
                        MBA in International Studies and Economics
                       </span>
                      </span>
                         <span>
                       <span>
                        MBA in International Studies and Economics
                       </span>
                      </span>
                         <span>
                       <span>
                        MBA in International Studies and Economics
                       </span>
                      </span>   <span>
                       <span>
                        MBA in International Studies and Economics
                       </span>
                      </span>
                         <span>
                       <span>
                        MBA in International Studies and Economics
                       </span>
                      </span>
                         <span>
                       <span>
                        MBA in International Studies and Economics
                       </span>
                      </span>
                         <span>
                       <span>
                        MBA in International Studies and Economics
                       </span>
                      </span>
                         <span>
                       <span>
                        MBA in International Studies and Economics
                       </span>
                      </span>
                         <span>
                       <span>
                        MBA in International Studies and Economics
                       </span>
                      </span>



                          </p>
                        </div>
                        <div>
                          <h>
                      <span>
                       2010-2014
                      </span>
                          </h5>
                        </div>
                        <div>
                          <h>
                      <span>
                       Texas University
                      </span>
                          </h4>
                        </div>
                        <div>
                          <p>
                      <span>
                       Bachelor of Arts in International Studies (BAIS)
                      </span>
                          </p>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div>
                    <div>
                      <div>
                        <div>
                          <hr>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div>
                    <div>
                      <div>
                        <div>
                          <h>
                      <span>
                       Professional skills
                      </span>
                          </h2>
                        </div>
                      </div>
                      <div>
                        <div>
                          <h>
                      <span>
                       Entrepreneurial Mindset
                      </span>
                          </h4>
                        </div>
                        <div>
                          <h>
                      <span>
                       Go-to-Market Planning
                      </span>
                          </h4>
                        </div>
                      </div>
                      <div>
                        <div>
                          <h>
                      <span>
                       Teamwork &amp; Collaboration
                      </span>
                          </h4>
                        </div>
                        <div>
                          <h>
                      <span>
                       Digital Analytics
                      </span>
                          </h4>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div>
                    <div>
                      <div>
                        <div>
                          <hr>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div>
                    <div>
                      <div>
                        <div>
                          <h>
                      <span>
                       Languages
                      </span>
                          </h2>
                        </div>
                      </div>
                      <div>
                        <div>
                          <h>
                      <span>
                       English
                      </span>
                          </h4>
                        </div>
                        <div>
                          <h>
                      <span>
                       French
                      </span>
                          </h4>
                        </div>
                      </div>
                         <span>
                       <span>
                        MBA in International Studies and Economics
                       </span>
                      </span>
                         <span>
                       <span>
                        MBA in International Studies and Economics
                       </span>
                      </span>
                         <span>
                       <span>
                        MBA in International Studies and Economics
                       </span>
                      </span>   <span>
                       <span>
                        MBA in International Studies and Economics
                       </span>
                      </span>


                      <div>
                        <div>
                          <h>
                      <span>
                       Dutch
                      </span>
                          </h4>
                        </div>
                        <div>
                          <h>
                      <span>
                       Spanish
                      </span>
                          </h4>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div>
                    <div>
                      <div>
                        <div>
                          <h>
                      <span>
                       Get in Touch
                      </span>
                          </h1>
                        </div>
                        <div>
                          <p>
                      <span>
                       <span>
                        Want to hear more about how I can help your project succeed. Send me an email or call me and let's talk about your needs.
                       </span>
                      </span>
                          </p>
                        </div>
                        <div>
                          <h>
                      <span>
                       Call: 123-456-7890
                      </span>
                          </h4>
                          <h>
                      <span>
                       <br>
                      </span>
                          </h4>
                          <h>
                      <span>
                       Write: info@mysite.com
                      </span>
                          </h4>
                        </div>
                        <span>
                    </span>
                      </div>
                      <div>
                        <div>
                          <h>
                          </h3>
                          <div>
                            <form>
                              <div>
                                <label>
                                  Name:
                                </label>
                                <input>
                                <input>
                              </div>
                              <div>
                                <label>
                                  Email:
                                </label>
                                <input>
                                <input>
                              </div>
                              <div>
                                <label>
                                  Message:
                                </label>
                                <textarea>
                        </textarea>
                                <input>
                              </div>
                              <span>
                       </span>
                              <div>
                                <input>
                              </div>
                              <input>
                              <input>
                              <input>
                              <input>
                            </form>
                          </div>
                          <div>
                            Thank you for contacting us.
                            <br>
                            We will get back to you as soon as possible.
                          </div>
                          <div>
                            Oops, there was an error sending your message.
                            <br>
                            Please try again later.
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
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
    public HtmlPage largeHtmlNoAttributes() throws Exception {
        return webClient.loadHtmlCodeIntoCurrentWindow(html);
    }
}
