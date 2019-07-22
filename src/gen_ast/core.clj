(ns gen-ast.core
  (:require [clojure.tools.analyzer.ast :as ast]
            [clojure.edn :as edn]
            [clojure.tools.analyzer.jvm :as ajvm]))

(def my-data (ast/children (ajvm/analyze '(defn  add-1 [x] (+ x 1)))))

(spit "res-raw.txt" (pr-str my-data))
