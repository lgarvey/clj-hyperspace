(ns hyperspace.core
  (:gen-class)
  (:use org.httpkit.server)
  (:require [selmer.parser :refer :all]
            [compojure.route :refer [files not-found]]
            [compojure.handler :refer [site]]
            [compojure.core :refer [defroutes GET POST DELETE ANY context]]))

(set-resource-path! (clojure.java.io/resource "templates"))

(defn home-page [req]
  (render-file "home.html" {}))

(defroutes all-routes
  (GET "/" [] home-page))

(defn -main
  [& args]
  (run-server (site #'all-routes) {:port 8080}))
