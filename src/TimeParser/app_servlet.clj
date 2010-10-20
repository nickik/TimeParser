(ns TimeParser.app_servlet
  (:gen-class :extends javax.servlet.http.HttpServlet)
  (:use TimeParser.core)
  (:use [appengine-magic.servlet :only [make-servlet-service-method]]))


(defn -service [this request response]
  ((make-servlet-service-method TimeParser-app) this request response))
