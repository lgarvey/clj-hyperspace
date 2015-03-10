(defproject hyperspace "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.3.2"]
                 [selmer "0.8.0"]
                 [http-kit "2.1.18"]
                 [javax.servlet/servlet-api "2.5"]]
  :main ^:skip-aot hyperspace.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
