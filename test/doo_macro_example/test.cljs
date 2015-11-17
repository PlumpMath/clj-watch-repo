(ns doo-macro-example.test
  (:require [cljs.nodejs :as nodejs])
  (:require-macros [doo-macro-example.macros :refer [example]]))

(nodejs/enable-util-print!)

(example)
