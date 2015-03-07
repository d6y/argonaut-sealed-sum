# JSON Sum Type Example Using argonaut-shapeless

A short example of a Shape sealed trait with a Circle and Square instance, 
which is encoded to and from JSON, and a function applied to compute
the area for the heck of it.

    $ sbt
    > run
	[info] Running code.Main
	The circle in JSON: {"Circle":{"radius":100}}
	The JSON encoded as a Shape: DecodeResult(\/-(Circle(100)))
	Square area: DecodeResult(\/-(2500.0))
	Circle area: DecodeResult(\/-(31415.926535897932))

## Links

* [Automatic argonaut codec derivation with shapeless](https://github.com/alexarchambault/argonaut-shapeless)
