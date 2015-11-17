(require 'cljs.build.api)

(cljs.build.api/watch (cljs.build.api/inputs "src" "test")
  {:main 'doo-macro-example.runner
   :target :nodejs
   :output-to "out/main.js"})
