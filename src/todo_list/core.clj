(ns todo-list.core
  (:require [ring.adapter.jetty :as http]
            [clojure.pprint :as pp]
            [ring.middleware.reload :refer [wrap-reload]]))

(defn handler
  [request]
  (if (= "/" (:uri request))
    {:status 200
     :headers {}
     :body  "<h1> Hello </h1>
      <p> I'm another fucking todo app with a handler function </p>"}
    {:status 404
     :body "<h1> Nope </h1> <p> No such page, tough titty"
     :headers {}}))

(defn -dev-main
  "simple http server usign Ring & Jetty"
  [port-number]
  (http/run-jetty
   (wrap-reload #'handler)
   {:port (Integer. port-number)
    :join? false}))

(defn -main
  "simple http server usign Ring & Jetty"
  [port-number]
  (http/run-jetty
   handler
   {:port (Integer. port-number)}))
