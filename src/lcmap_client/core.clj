(ns lcmap-client.core
  (:require [lcmap-client.http :refer :all])
  (:refer-clojure :exclude [get update]))

(def noop :noop)
