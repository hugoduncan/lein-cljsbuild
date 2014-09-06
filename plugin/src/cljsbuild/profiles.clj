;; profiles injected by plugin
{:mixed-source
 {:cljsbuild {:builds {:release
                       {:source-paths ["src/cljs"]
                        :compiler
                        {:output-to "target/classes/public/js/project.min.js"
                         :optimizations :advanced
                         :pretty-print false}}}}}
 :mixed-source-dev
 {:cljsbuild {:builds {:dev
                       {:source-paths ["src/cljs"]
                        :compiler
                        {:output-to "target/classes/public/js/project.js"
                         :output-dir "target/classes/public/js/project"
                         :optimizations :none
                         :pretty-print true
                         :source-map true}}}}}
 :mixed-test
 {:cljsbuild {:builds {:test
                       {:source-paths ["src/cljs" "test/cljs"]
                        :compiler
                        {:output-to "target/classes/public/js/project.test.js"
                         :optimizations :none
                         :pretty-print true}}}
              :test-commands {"unit"
                              ["runners/phantomjs.js"
                               :runner
                               "target/classes/public/js/project.test.js"]}}}

 :with-generated-source
 {:cljsbuild {:builds {:release {:source-paths ["target/generated/src/cljs"]}}}}

 :with-generated-source-dev
 {:cljsbuild {:builds {:dev {:source-paths ["target/generated/src/cljs"]}}}}

 :with-generated-test
 {:cljsbuild {:builds {:dev {:source-paths ["target/generated/src/cljs"
                                            "target/generated/test/cljs"]}}}}}
