(ns lambda-chess.core
  (:require [clj-chess-engine.core :as chess]))

(def my-fn
  (fn random-f [{valid-moves :valid-moves am-i-white? :white-turn}]
                      (let [v (into [] valid-moves)]
                        (let [move (rand-int (count valid-moves))]
                          {:move (get v move), :state nil})))
)


(defn -main []
  (chess/trace-game-play my-fn my-fn))
