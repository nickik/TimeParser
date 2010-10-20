(ns TimeParser.core
  (:use [compojure.core :only [defroutes GET]]
        [sandbar.core]
        [sandbar.stateful-session :only [wrap-stateful-session
                                         set-flash-value!]]
        [sandbar.validation :only [build-validator
                                   non-empty-string
                                   add-validation-error]])
  (:require [compojure.route :as route]
            [appengine-magic.core :as ae]
            [sandbar.forms :as forms]))

(defroutes main-routes
  (GET "/" [] "<h1>Hello World</h1>"))


(ae/def-appengine-app TimeParser-app #'main-routes)
