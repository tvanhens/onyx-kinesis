(defproject onyx-kinesis "0.5.3"
  :description "Onyx plugin for kinesis"
  :url "https://github.com/tvanhens/onyx-kinesis"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0-alpha5"]
                 [com.mdrogalis/onyx "0.5.3"]
                 [org.clojure/data.fressian "0.2.0"]
                 [amazonica "0.3.19"]]
  :profiles {:dev {:dependencies [[com.mdrogalis/onyx-core-async "0.5.3"]
                                  [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                                  [midje "1.6.2"]]}})
