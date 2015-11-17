(defproject doo-macro-example "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.170"]]
  :plugins [[lein-cljsbuild "1.1.0"]
            [lein-doo "0.1.4"]]
  :source-paths ["src" "test"]
  :cljsbuild {:builds {:test {:source-paths ["src" "test"]
                              :compiler {:output-to "resources/public/js/tests.js"
                                         :main "doo-macro-example.runner"
                                         :optimizations :none}}}})
