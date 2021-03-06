package typingsSlinky.synaptic.synapticMod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.synaptic.Anon_Activationsentences
import typingsSlinky.synaptic.Anon_Connection
import typingsSlinky.synaptic.Anon_Connections
import typingsSlinky.synaptic.synapticMod.Neuron.Connection
import typingsSlinky.synaptic.synapticMod.Neuron.SquashingFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("synaptic", "Neuron")
@js.native
/**
  * Neurons are the basic unit of the neural network. They can be connected together, or used to gate connections between other neurons.
  */
class Neuron () extends js.Object {
  /**
    * By default, a neuron uses a random bias.
    * @default random
    */
  var bias: Double = js.native
  /**
    * By default, a neuron uses a Logistic Sigmoid as its squashing/activation function.
    * @default LOGISTIC
    */
  @JSName("squash")
  var squash_Original: SquashingFunction = js.native
  /**
    * When a neuron activates, it computes its state from all its input connections and squashes it using its activation function, and returns the output (activation).
    * @param activation You can provide the activation as a parameter (useful for neurons in the input layer. it has to be a float between 0 and 1).
    */
  def activate(): Double = js.native
  def activate(activation: Double): Double = js.native
  /**
    * Clears all the traces (the neuron forgets it's context, but the connections remain intact).
    */
  def clear(): Unit = js.native
  /**
    * Returns true or false whether the neuron is connected to another neuron (parameter).
    * @param neuron
    */
  def connected(): Anon_Connection | Boolean = js.native
  def connected(neuron: js.Any): Anon_Connection | Boolean = js.native
  /**
    * A neuron can gate a connection between two neurons, or a neuron's self-connection. This allows you to create second order neural network architectures.
    * @param connection
    */
  def gate(connection: Connection): Unit = js.native
  /**
    * Hardcodes the behavior of the neuron into an optimized function.
    */
  def optimize(): Anon_Activationsentences = js.native
  def optimize(optimized: js.Any): Anon_Activationsentences = js.native
  def optimize(optimized: js.Any, layer: js.Any): Anon_Activationsentences = js.native
  /**
    * A neuron can project a connection to another neuron. Neurons can also self-connect.
    */
  def project(neuron: Neuron): Connection = js.native
  def project(neuron: Neuron, weight: Double): Connection = js.native
  /**
    * After an activation, you can teach the neuron what should have been the correct output (a.k.a. train). This is done by backpropagating the error.
    * @param learningRate a learning rate
    * @param targetValue a target value (float between 0 and 1)
    */
  def propagate(learningRate: Double, targetValue: Double): Unit = js.native
  /**
    * All the connections are randomized and the traces are cleared.
    */
  def reset(): Unit = js.native
  /**
    * Returns true or false whether the neuron is self-connected or not.
    */
  def selfconnected(): Boolean = js.native
  /**
    * By default, a neuron uses a Logistic Sigmoid as its squashing/activation function.
    * @default LOGISTIC
    */
  def squash(x: Double, derivate: Boolean): Double = js.native
}

/* static members */
@JSImport("synaptic", "Neuron")
@js.native
object Neuron extends js.Object {
  @js.native
  class Connection protected () extends js.Object {
    def this(from: Double, to: Double) = this()
    def this(from: Double, to: Double, weight: Double) = this()
    var ID: Double = js.native
    var from: Double = js.native
    var gain: Double = js.native
    var gater: Neuron = js.native
    var to: Double = js.native
    var weight: Double = js.native
  }
  
  @js.native
  class connection protected () extends Connection {
    def this(from: Double, to: Double) = this()
    def this(from: Double, to: Double, weight: Double) = this()
  }
  
  def quantity(): Anon_Connections = js.native
  def uid(): Double = js.native
  /* static members */
  @js.native
  object Connection extends js.Object {
    def uid(): Double = js.native
  }
  
  @js.native
  object connection
    extends Instantiable2[/* from */ Double, /* to */ Double, Connection]
       with Instantiable3[/* from */ Double, /* to */ Double, /* weight */ Double, Connection] {
    def uid(): Double = js.native
  }
  
  @js.native
  object squash extends js.Object {
    val HLIM: SquashingFunction = js.native
    val IDENTITY: SquashingFunction = js.native
    val LOGISTIC: SquashingFunction = js.native
    val ReLU: SquashingFunction = js.native
    val TANH: SquashingFunction = js.native
  }
  
  type SquashingFunction = js.Function2[/* x */ Double, /* derivate */ Boolean, Double]
}

