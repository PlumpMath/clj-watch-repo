(require 'cljs.build.api)

(cljs.build.api/watch "src"
  {:main 'doo-macro-example.test
   :target :nodejs
   :output-to "out/main.js"})
