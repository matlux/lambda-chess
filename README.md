# lambda-chess

A Clojure command line application designed to test the implementation of your function before you submit it to [lambda-zone.com](http://www.lambda-zone.com).

## Usage

### Quick setup

Run:

    git clone git@github.com:matlux/lambda-chess.git
    lein run

You should get something like this:
```
$ lein run
+---+---+---+---+---+---+---+---+
| r | n | b | q | k | b | n | r |
+---+---+---+---+---+---+---+---+
| p | p | p | p | p | p | p | p |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
| P | P | P | P | P | P | P | P |
+---+---+---+---+---+---+---+---+
| R | N | B | Q | K | B | N | R |
+---+---+---+---+---+---+---+---+
white: 
valid moves: [[h2 h3] [h2 h4] [g2 g3] [g2 g4] [f2 f3] [f2 f4] [g1 f3] [g1 h3] [e2 e3] [e2 e4] [d2 d3] [d2 d4] [c2 c3] [c2 c4] [b2 b3] [b2 b4] [a2 a3] [a2 a4] [b1 c3] [b1 a3]]
choosen move: [e2 e4]

+---+---+---+---+---+---+---+---+
| r | n | b | q | k | b | n | r |
+---+---+---+---+---+---+---+---+
| p | p | p | p | p | p | p | p |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |   | P |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
| P | P | P | P |   | P | P | P |
+---+---+---+---+---+---+---+---+
| R | N | B | Q | K | B | N | R |
+---+---+---+---+---+---+---+---+
black: 
valid moves: [[c7 c6] [c7 c5] [b8 c6] [b8 a6] [b7 b6] [b7 b5] [a7 a6] [a7 a5] [g8 h6] [g8 f6] [h7 h6] [h7 h5] [g7 g6] [g7 g5] [f7 f6] [f7 f5] [e7 e6] [e7 e5] [d7 d6] [d7 d5]]
choosen move: [b7 b6]

+---+---+---+---+---+---+---+---+
| r | n | b | q | k | b | n | r |
+---+---+---+---+---+---+---+---+
| p |   | p | p | p | p | p | p |
+---+---+---+---+---+---+---+---+
|   | p |   |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |   | P |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
+---+---+---+---+---+---+---+---+
| P | P | P | P |   | P | P | P |
+---+---+---+---+---+---+---+---+
| R | N | B | Q | K | B | N | R |
+---+---+---+---+---+---+---+---+
white: 
valid moves: [[h2 h3] [h2 h4] [e4 e5] [g2 g3] [g2 g4] [f2 f3] [f2 f4] [g1 f3] [g1 e2] [g1 h3] [f1 a6] [f1 b5] [f1 c4] [f1 d3] [f1 e2] [d2 d3] [d2 d4] [e1 e2] [c2 c3] [c2 c4] [d1 e2] [d1 f3] [d1 g4] [d1 h5] [b2 b3] [b2 b4] [a2 a3] [a2 a4] [b1 c3] [b1 a3]]
choosen move: [c2 c3]
```

### Start implementing you function

* Edit [src/lambda_chess/core.clj](https://github.com/matlux/lambda-chess/blob/master/src/lambda_chess/core.clj)
* modify my-fn
* lein run

And iterate as many time as it takes to implement your strategy. A help is available [under](https://github.com/matlux/lambda-zone/wiki/Chess).

### Submit your function onto [lambda-zone.com](http://www.lambda-zone.com)

* go to [lambda-zone.com](http://www.lambda-zone.com)
* login with an OpenId of your choice
* give a unique name to the 'function name' field.
* copy the anonymous function within the my-fn scope

For example take:
```clojure
  (fn [{:keys [board valid-moves am-i-white? in-check? history state]}]
                      (let [v (into [] valid-moves)]
                        (let [move (rand-int (count valid-moves))]
                          {:move (get v move), :state nil})))

```


from the

```clojure
(def my-fn
  ;;-----------------
  ;; copy and past this anonymous function on lambda-zone.com
  (fn [{:keys [board valid-moves am-i-white? in-check? history state]}]
                      (let [v (into [] valid-moves)]
                        (let [move (rand-int (count valid-moves))]
                          {:move (get v move), :state nil})))
  ;;-----------------
)
```

* paste it into the 'function code' field
* Click the Submit button

## License

Copyright © 2014 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
