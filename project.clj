(defproject TimeParser "1.0.0 Snapshot"
  :description "A simple website that parses a SAP file"
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [compojure "0.5.2"]
                 [hiccup "0.2.6"]
                 [sandbar/sandbar-core "0.3.1"]
                 [sandbar/sandbar-session "0.2.5"]]
  :dev-dependencies [[appengine-magic "0.2.0"]
                     [swank-clojure "1.2.1"]
                     [clj-stacktrace "0.2.0"]])
