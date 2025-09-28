## 4.16.0

JMH version: 1.37
VM version: JDK 21.0.8, OpenJDK 64-Bit Server VM, 21.0.8+9-Ubuntu-0ubuntu124.04.1
VM invoker: /usr/lib/jvm/java-21-openjdk-amd64/bin/java
VM options: <none>


Benchmark                                                                                                 (file)  Mode  Cnt        Score         Error  Units
HtmlParserBenchmark.domParser                src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/simple.html  avgt    3    22944.483 ±    4679.767  ns/op
HtmlParserBenchmark.domParser     src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/small-xc-homepage.html  avgt    3   143712.878 ±   18947.922  ns/op
HtmlParserBenchmark.domParser       src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/wikipedia-de-hp.html  avgt    3   642298.726 ±  119968.997  ns/op
HtmlParserBenchmark.domParser            src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/puma-de-hp.html  avgt    3  3808258.970 ±  266052.422  ns/op
HtmlParserBenchmark.saxParser                src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/simple.html  avgt    3    22737.082 ±    2729.177  ns/op
HtmlParserBenchmark.saxParser     src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/small-xc-homepage.html  avgt    3   110537.352 ±   54634.958  ns/op
HtmlParserBenchmark.saxParser       src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/wikipedia-de-hp.html  avgt    3   504791.819 ±   29175.969  ns/op
HtmlParserBenchmark.saxParser            src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/puma-de-hp.html  avgt    3  2913589.024 ± 1248840.887  ns/op
HtmlParserBenchmark.simpleParser             src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/simple.html  avgt    3    13565.033 ±    3526.485  ns/op
HtmlParserBenchmark.simpleParser  src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/small-xc-homepage.html  avgt    3   104030.006 ±   26465.037  ns/op
HtmlParserBenchmark.simpleParser    src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/wikipedia-de-hp.html  avgt    3   486995.662 ±  121109.887  ns/op
HtmlParserBenchmark.simpleParser         src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/puma-de-hp.html  avgt    3  2856848.530 ±  515661.730  ns/op

Benchmark                                                                                                 (file)  Mode  Cnt        Score         Error  Units
HtmlParserBenchmark.domParser                src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/simple.html  avgt    3    23015.127 ±    3165.051  ns/op
HtmlParserBenchmark.domParser     src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/small-xc-homepage.html  avgt    3   141375.221 ±   15186.866  ns/op
HtmlParserBenchmark.domParser       src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/wikipedia-de-hp.html  avgt    3   626619.325 ±  127813.303  ns/op
HtmlParserBenchmark.domParser            src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/puma-de-hp.html  avgt    3  3748854.131 ± 1303504.762  ns/op
HtmlParserBenchmark.saxParser                src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/simple.html  avgt    3    22531.508 ±    4118.371  ns/op
HtmlParserBenchmark.saxParser     src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/small-xc-homepage.html  avgt    3   109964.395 ±   10847.277  ns/op
HtmlParserBenchmark.saxParser       src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/wikipedia-de-hp.html  avgt    3   491431.391 ±   66367.841  ns/op
HtmlParserBenchmark.saxParser            src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/puma-de-hp.html  avgt    3  2890004.378 ±  162938.759  ns/op
HtmlParserBenchmark.simpleParser             src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/simple.html  avgt    3    13393.346 ±    3124.292  ns/op
HtmlParserBenchmark.simpleParser  src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/small-xc-homepage.html  avgt    3    99037.063 ±   15929.052  ns/op
HtmlParserBenchmark.simpleParser    src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/wikipedia-de-hp.html  avgt    3   467918.128 ±   28441.190  ns/op
HtmlParserBenchmark.simpleParser         src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/puma-de-hp.html  avgt    3  2795529.512 ±  453318.332  ns/op


## 4.17.0-SNAPSHOT

Benchmark                                                                                                          (file)  Mode  Cnt        Score         Error  Units
HtmlParserBenchmark.domParser                         src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/simple.html  avgt    3    23531.184 ±    2600.212  ns/op
HtmlParserBenchmark.domParser              src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/small-xc-homepage.html  avgt    3   149031.678 ±   20170.192  ns/op
HtmlParserBenchmark.domParser                src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/wikipedia-de-hp.html  avgt    3   633533.264 ±   34079.977  ns/op
HtmlParserBenchmark.domParser                     src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/puma-de-hp.html  avgt    3  3761398.629 ±  981650.711  ns/op
HtmlParserBenchmark.domParserWithCache                src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/simple.html  avgt    3    14123.433 ±    1129.530  ns/op
HtmlParserBenchmark.domParserWithCache     src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/small-xc-homepage.html  avgt    3   135730.806 ±   49829.654  ns/op
HtmlParserBenchmark.domParserWithCache       src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/wikipedia-de-hp.html  avgt    3   608117.772 ±  148529.788  ns/op
HtmlParserBenchmark.domParserWithCache            src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/puma-de-hp.html  avgt    3  3814756.399 ±  299960.030  ns/op
HtmlParserBenchmark.saxParser                         src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/simple.html  avgt    3    13667.546 ±    1360.354  ns/op
HtmlParserBenchmark.saxParser              src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/small-xc-homepage.html  avgt    3    99628.276 ±   15545.350  ns/op
HtmlParserBenchmark.saxParser                src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/wikipedia-de-hp.html  avgt    3   466321.497 ±   20778.857  ns/op
HtmlParserBenchmark.saxParser                     src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/puma-de-hp.html  avgt    3  2829444.167 ±  817966.343  ns/op
HtmlParserBenchmark.saxParserWithCache                src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/simple.html  avgt    3    13819.011 ±     439.910  ns/op
HtmlParserBenchmark.saxParserWithCache     src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/small-xc-homepage.html  avgt    3    98863.013 ±   17245.084  ns/op
HtmlParserBenchmark.saxParserWithCache       src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/wikipedia-de-hp.html  avgt    3   472916.321 ±   49730.653  ns/op
HtmlParserBenchmark.saxParserWithCache            src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/puma-de-hp.html  avgt    3  2910050.605 ±  262513.646  ns/op
HtmlParserBenchmark.simpleParser                      src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/simple.html  avgt    3    13831.374 ±     641.394  ns/op
HtmlParserBenchmark.simpleParser           src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/small-xc-homepage.html  avgt    3    96613.088 ±    6559.302  ns/op
HtmlParserBenchmark.simpleParser             src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/wikipedia-de-hp.html  avgt    3   474112.599 ±   36413.453  ns/op
HtmlParserBenchmark.simpleParser                  src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/puma-de-hp.html  avgt    3  2890090.834 ± 1028280.771  ns/op
HtmlParserBenchmark.simpleParserWithCache             src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/simple.html  avgt    3    13554.535 ±     138.342  ns/op
HtmlParserBenchmark.simpleParserWithCache  src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/small-xc-homepage.html  avgt    3    95992.739 ±   13949.041  ns/op
HtmlParserBenchmark.simpleParserWithCache    src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/wikipedia-de-hp.html  avgt    3   479332.584 ±   71293.025  ns/op
HtmlParserBenchmark.simpleParserWithCache         src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/puma-de-hp.html  avgt    3  2830243.576 ±  903207.192  ns/op

Benchmark                                                                                                          (file)  Mode  Cnt          Score          Error  Units
HtmlParserBenchmark.domParser                         src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/simple.html  avgt    3      13914.903 ±     4156.547  ns/op
HtmlParserBenchmark.domParser              src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/small-xc-homepage.html  avgt    3     130563.829 ±    43859.491  ns/op
HtmlParserBenchmark.domParser                src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/wikipedia-de-hp.html  avgt    3     620670.344 ±    94221.149  ns/op
HtmlParserBenchmark.domParser                     src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/puma-de-hp.html  avgt    3    3896089.652 ±   463009.284  ns/op
HtmlParserBenchmark.domParser                  src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/html-standard.html  avgt    3  135442998.646 ± 29292096.170  ns/op
HtmlParserBenchmark.domParserWithCache                src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/simple.html  avgt    3      13722.261 ±     1791.031  ns/op
HtmlParserBenchmark.domParserWithCache     src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/small-xc-homepage.html  avgt    3     131171.477 ±    31378.488  ns/op
HtmlParserBenchmark.domParserWithCache       src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/wikipedia-de-hp.html  avgt    3     604647.755 ±    95084.409  ns/op
HtmlParserBenchmark.domParserWithCache            src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/puma-de-hp.html  avgt    3    3775626.966 ±  1087578.420  ns/op
HtmlParserBenchmark.domParserWithCache         src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/html-standard.html  avgt    3  136258129.209 ± 40664019.002  ns/op
HtmlParserBenchmark.saxParser                         src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/simple.html  avgt    3      13778.382 ±     2237.026  ns/op
HtmlParserBenchmark.saxParser              src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/small-xc-homepage.html  avgt    3      99221.553 ±    23549.364  ns/op
HtmlParserBenchmark.saxParser                src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/wikipedia-de-hp.html  avgt    3     480511.845 ±    51163.701  ns/op
HtmlParserBenchmark.saxParser                     src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/puma-de-hp.html  avgt    3    2886485.919 ±   124252.850  ns/op
HtmlParserBenchmark.saxParser                  src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/html-standard.html  avgt    3   99630243.952 ± 11756151.148  ns/op
HtmlParserBenchmark.saxParserWithCache                src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/simple.html  avgt    3      13563.657 ±     3749.925  ns/op
HtmlParserBenchmark.saxParserWithCache     src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/small-xc-homepage.html  avgt    3      98210.782 ±    23385.916  ns/op
HtmlParserBenchmark.saxParserWithCache       src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/wikipedia-de-hp.html  avgt    3     489241.755 ±   110737.028  ns/op
HtmlParserBenchmark.saxParserWithCache            src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/puma-de-hp.html  avgt    3    2862771.552 ±   734891.776  ns/op
HtmlParserBenchmark.saxParserWithCache         src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/html-standard.html  avgt    3   99543204.529 ± 29552872.257  ns/op
HtmlParserBenchmark.simpleParser                      src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/simple.html  avgt    3      13389.419 ±     4129.395  ns/op
HtmlParserBenchmark.simpleParser           src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/small-xc-homepage.html  avgt    3      97144.302 ±    25014.716  ns/op
HtmlParserBenchmark.simpleParser             src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/wikipedia-de-hp.html  avgt    3     478407.505 ±   128105.606  ns/op
HtmlParserBenchmark.simpleParser                  src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/puma-de-hp.html  avgt    3    2932613.388 ±   718909.806  ns/op
HtmlParserBenchmark.simpleParser               src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/html-standard.html  avgt    3   97302384.773 ± 31634510.648  ns/op
HtmlParserBenchmark.simpleParserWithCache             src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/simple.html  avgt    3      13858.449 ±     1124.428  ns/op
HtmlParserBenchmark.simpleParserWithCache  src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/small-xc-homepage.html  avgt    3      98452.723 ±    31295.358  ns/op
HtmlParserBenchmark.simpleParserWithCache    src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/wikipedia-de-hp.html  avgt    3     474697.056 ±    36012.301  ns/op
HtmlParserBenchmark.simpleParserWithCache         src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/puma-de-hp.html  avgt    3    2902929.583 ±   450428.375  ns/op
HtmlParserBenchmark.simpleParserWithCache      src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/html-standard.html  avgt    3   99160441.065 ± 12526841.113  ns/op

Benchmark                                                                                                          (file)  Mode  Cnt          Score          Error  Units
HtmlParserBenchmark.domParser                         src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/simple.html  avgt    3      13818.316 ±     5085.240  ns/op
HtmlParserBenchmark.domParser              src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/small-xc-homepage.html  avgt    3     134331.742 ±    18690.516  ns/op
HtmlParserBenchmark.domParser                src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/wikipedia-de-hp.html  avgt    3     610446.669 ±    84502.555  ns/op
HtmlParserBenchmark.domParser                     src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/puma-de-hp.html  avgt    3    3802039.991 ±  1381641.097  ns/op
HtmlParserBenchmark.domParser                  src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/html-standard.html  avgt    3  138114444.772 ± 27739795.273  ns/op
HtmlParserBenchmark.domParserWithCache                src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/simple.html  avgt    3      14170.721 ±     1942.366  ns/op
HtmlParserBenchmark.domParserWithCache     src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/small-xc-homepage.html  avgt    3     130656.717 ±    33904.383  ns/op
HtmlParserBenchmark.domParserWithCache       src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/wikipedia-de-hp.html  avgt    3     631465.681 ±    41379.934  ns/op
HtmlParserBenchmark.domParserWithCache            src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/puma-de-hp.html  avgt    3    3863368.947 ±   208939.938  ns/op
HtmlParserBenchmark.domParserWithCache         src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/html-standard.html  avgt    3  137619175.279 ±  6352546.254  ns/op
HtmlParserBenchmark.saxParser                         src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/simple.html  avgt    3      13665.305 ±     4393.192  ns/op
HtmlParserBenchmark.saxParser              src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/small-xc-homepage.html  avgt    3      96787.003 ±     9930.442  ns/op
HtmlParserBenchmark.saxParser                src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/wikipedia-de-hp.html  avgt    3     473550.612 ±   112063.885  ns/op
HtmlParserBenchmark.saxParser                     src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/puma-de-hp.html  avgt    3    2863430.259 ±   714367.228  ns/op
HtmlParserBenchmark.saxParser                  src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/html-standard.html  avgt    3   99211945.205 ± 24107137.426  ns/op
HtmlParserBenchmark.saxParserWithCache                src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/simple.html  avgt    3      13838.879 ±      318.501  ns/op
HtmlParserBenchmark.saxParserWithCache     src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/small-xc-homepage.html  avgt    3     101961.564 ±     6905.357  ns/op
HtmlParserBenchmark.saxParserWithCache       src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/wikipedia-de-hp.html  avgt    3     476252.835 ±    67494.199  ns/op
HtmlParserBenchmark.saxParserWithCache            src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/puma-de-hp.html  avgt    3    2847851.347 ±   661724.942  ns/op
HtmlParserBenchmark.saxParserWithCache         src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/html-standard.html  avgt    3  100729018.741 ± 21514281.711  ns/op
HtmlParserBenchmark.simpleParser                      src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/simple.html  avgt    3      13709.386 ±     2933.874  ns/op
HtmlParserBenchmark.simpleParser           src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/small-xc-homepage.html  avgt    3      97104.760 ±    20676.284  ns/op
HtmlParserBenchmark.simpleParser             src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/wikipedia-de-hp.html  avgt    3     475555.745 ±    32033.838  ns/op
HtmlParserBenchmark.simpleParser                  src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/puma-de-hp.html  avgt    3    2889412.035 ±   740475.692  ns/op
HtmlParserBenchmark.simpleParser               src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/html-standard.html  avgt    3   99784112.001 ± 10025951.547  ns/op
HtmlParserBenchmark.simpleParserWithCache             src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/simple.html  avgt    3      13482.171 ±     2977.592  ns/op
HtmlParserBenchmark.simpleParserWithCache  src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/small-xc-homepage.html  avgt    3      98330.487 ±     4123.268  ns/op
HtmlParserBenchmark.simpleParserWithCache    src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/wikipedia-de-hp.html  avgt    3     479750.481 ±    64079.042  ns/op
HtmlParserBenchmark.simpleParserWithCache         src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/puma-de-hp.html  avgt    3    2959537.637 ±   149878.184  ns/op
HtmlParserBenchmark.simpleParserWithCache      src/main/resources/org/htmlunit/jmh/benchmarks/htmlunit/html-standard.html  avgt    3   99315045.074 ± 16845608.936  ns/op

