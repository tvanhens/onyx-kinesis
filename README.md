## onyx-core-kinesis

Onyx plugin for kinesis.

#### Installation

In your project file:

```clojure
[onyx-kinesis "0.5.3"]
```

In your peer boot-up namespace:

```clojure
(:require [onyx.plugin.kinesis])
```

#### Catalog entries

##### sample-entry

```clojure
{:onyx/name :entry-name
 :onyx/ident :kinesis/task
 :onyx/type :input
 :onyx/medium :kinesis
 :onyx/consumption :concurrent
 :onyx/batch-size batch-size
 :onyx/doc "Reads segments from kinesis"}
```

#### Attributes

|key                           | type      | description
|------------------------------|-----------|------------
|`:kinesis/attr`            | `string`  | Description here.

#### Lifecycle Arguments

##### `sample-entry`

```clojure
(defmethod l-ext/inject-lifecycle-resources :kinesis/task
  [_ _] {:kinesis/arg val})
```

#### Contributing

Pull requests into the master branch are welcomed.

#### License

Copyright © 2014 FIX ME

Distributed under the Eclipse Public License, the same as Clojure.
