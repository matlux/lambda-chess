(ns lambda-chess.core
  (:require [clj-chess-engine.core :as chess]))

;; my-fn is the var pointing onto the function we want to test
(def my-fn
  ;;-----------------
  ;; copy and past this anonymous function on lambda-zone.com
  (fn [{:keys [board valid-moves am-i-white? in-check? history state]}]
                      (let [v (into [] valid-moves)]
                        (let [move (rand-int (count valid-moves))]
                          {:move (get v move), :state nil})))
  ;;-----------------
)


(defn test-fn-vs-fn []
  "play a white function against a black function"
  (chess/trace-game-play {:white my-fn :black my-fn}))
(defn test-fn-vs-human []
  "play a white function against a human playing black"
  (chess/trace-game-play {:white my-fn}))
(defn test-human-vs-fn []
  "play a human playing white against a black function"
  (chess/trace-game-play {:black my-fn}))

;; un comment the type of test you want to run
;; i.e. do you want to play 2 functions agains one another or a function against an interactive prompt?
(defn -main []
  (test-fn-vs-fn)
  ;;(test-fn-vs-human)
  ;;(test-human-vs-fn)

  )
