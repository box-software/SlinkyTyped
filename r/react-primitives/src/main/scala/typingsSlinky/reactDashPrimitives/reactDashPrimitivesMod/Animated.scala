package typingsSlinky.reactDashPrimitives.reactDashPrimitivesMod

import typingsSlinky.reactDashNative.Anon_XY
import typingsSlinky.reactDashNative.reactDashNativeMod.Animated.AnimatedValue
import typingsSlinky.reactDashNative.reactDashNativeMod.Animated.AnimatedValueXY
import typingsSlinky.reactDashNative.reactDashNativeMod.Animated.CompositeAnimation
import typingsSlinky.reactDashNative.reactDashNativeMod.Animated.DecayAnimationConfig
import typingsSlinky.reactDashNative.reactDashNativeMod.Animated.EventConfig
import typingsSlinky.reactDashNative.reactDashNativeMod.Animated.LoopAnimationConfig
import typingsSlinky.reactDashNative.reactDashNativeMod.Animated.Mapping
import typingsSlinky.reactDashNative.reactDashNativeMod.Animated.ParallelConfig
import typingsSlinky.reactDashNative.reactDashNativeMod.Animated.SpringAnimationConfig
import typingsSlinky.reactDashNative.reactDashNativeMod.Animated.TimingAnimationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-primitives", "Animated")
@js.native
object Animated extends js.Object {
  @js.native
  class Animated ()
    extends typingsSlinky.reactDashNative.reactDashNativeMod.Animated.Animated
  
  @js.native
  class AnimatedAddition ()
    extends typingsSlinky.reactDashNative.reactDashNativeMod.Animated.AnimatedInterpolation
  
  @js.native
  class AnimatedDiffClamp ()
    extends typingsSlinky.reactDashNative.reactDashNativeMod.Animated.AnimatedInterpolation
  
  @js.native
  class AnimatedDivision ()
    extends typingsSlinky.reactDashNative.reactDashNativeMod.Animated.AnimatedInterpolation
  
  @js.native
  class AnimatedInterpolation ()
    extends typingsSlinky.reactDashNative.reactDashNativeMod.Animated.AnimatedInterpolation
  
  @js.native
  class AnimatedModulo ()
    extends typingsSlinky.reactDashNative.reactDashNativeMod.Animated.AnimatedInterpolation
  
  @js.native
  class AnimatedMultiplication ()
    extends typingsSlinky.reactDashNative.reactDashNativeMod.Animated.AnimatedInterpolation
  
  @js.native
  class AnimatedSubtraction ()
    extends typingsSlinky.reactDashNative.reactDashNativeMod.Animated.AnimatedInterpolation
  
  @js.native
  class AnimatedWithChildren ()
    extends typingsSlinky.reactDashNative.reactDashNativeMod.Animated.Animated
  
  @js.native
  class Value protected ()
    extends typingsSlinky.reactDashNative.reactDashNativeMod.Animated.Value {
    def this(value: Double) = this()
  }
  
  @js.native
  class ValueXY ()
    extends typingsSlinky.reactDashNative.reactDashNativeMod.Animated.ValueXY {
    def this(valueIn: Anon_XY) = this()
  }
  
  val FlatList: js.Any = js.native
  val Image: js.Any = js.native
  val ScrollView: js.Any = js.native
  val SectionList: js.Any = js.native
  val Text: js.Any = js.native
  val View: js.Any = js.native
  def add(
    a: typingsSlinky.reactDashNative.reactDashNativeMod.Animated.Animated,
    b: typingsSlinky.reactDashNative.reactDashNativeMod.Animated.Animated
  ): typingsSlinky.reactDashNative.reactDashNativeMod.Animated.AnimatedAddition = js.native
  def createAnimatedComponent(component: js.Any): js.Any = js.native
  def decay(value: AnimatedValueXY, config: DecayAnimationConfig): CompositeAnimation = js.native
  def decay(value: AnimatedValue, config: DecayAnimationConfig): CompositeAnimation = js.native
  def delay(time: Double): CompositeAnimation = js.native
  def diffClamp(a: typingsSlinky.reactDashNative.reactDashNativeMod.Animated.Animated, min: Double, max: Double): typingsSlinky.reactDashNative.reactDashNativeMod.Animated.AnimatedDiffClamp = js.native
  def divide(
    a: typingsSlinky.reactDashNative.reactDashNativeMod.Animated.Animated,
    b: typingsSlinky.reactDashNative.reactDashNativeMod.Animated.Animated
  ): typingsSlinky.reactDashNative.reactDashNativeMod.Animated.AnimatedDivision = js.native
  def event[T](argMapping: js.Array[Mapping | Null]): js.Function1[/* repeated */ js.Any, Unit] = js.native
  def event[T](argMapping: js.Array[Mapping | Null], config: EventConfig[T]): js.Function1[/* repeated */ js.Any, Unit] = js.native
  def loop(animation: CompositeAnimation): CompositeAnimation = js.native
  def loop(animation: CompositeAnimation, config: LoopAnimationConfig): CompositeAnimation = js.native
  def modulo(a: typingsSlinky.reactDashNative.reactDashNativeMod.Animated.Animated, modulus: Double): typingsSlinky.reactDashNative.reactDashNativeMod.Animated.AnimatedModulo = js.native
  def multiply(
    a: typingsSlinky.reactDashNative.reactDashNativeMod.Animated.Animated,
    b: typingsSlinky.reactDashNative.reactDashNativeMod.Animated.Animated
  ): typingsSlinky.reactDashNative.reactDashNativeMod.Animated.AnimatedMultiplication = js.native
  def parallel(animations: js.Array[CompositeAnimation]): CompositeAnimation = js.native
  def parallel(animations: js.Array[CompositeAnimation], config: ParallelConfig): CompositeAnimation = js.native
  def sequence(animations: js.Array[CompositeAnimation]): CompositeAnimation = js.native
  def spring(value: AnimatedValueXY, config: SpringAnimationConfig): CompositeAnimation = js.native
  def spring(value: AnimatedValue, config: SpringAnimationConfig): CompositeAnimation = js.native
  def stagger(time: Double, animations: js.Array[CompositeAnimation]): CompositeAnimation = js.native
  def subtract(
    a: typingsSlinky.reactDashNative.reactDashNativeMod.Animated.Animated,
    b: typingsSlinky.reactDashNative.reactDashNativeMod.Animated.Animated
  ): typingsSlinky.reactDashNative.reactDashNativeMod.Animated.AnimatedSubtraction = js.native
  def timing(value: AnimatedValueXY, config: TimingAnimationConfig): CompositeAnimation = js.native
  def timing(value: AnimatedValue, config: TimingAnimationConfig): CompositeAnimation = js.native
}

