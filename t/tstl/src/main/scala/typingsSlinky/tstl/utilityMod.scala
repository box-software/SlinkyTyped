package typingsSlinky.tstl

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/utility", JSImport.Namespace)
@js.native
object utilityMod extends js.Object {
  @js.native
  class Entry[Key, T] protected ()
    extends typingsSlinky.tstl.utilityEntryMod.Entry[Key, T] {
    /**
      * Intializer Constructor.
      *
      * @param first The first, key element.
      * @param second The second, mapped element.
      */
    def this(first: Key, second: T) = this()
  }
  
  @js.native
  class Pair[First, Second] protected ()
    extends typingsSlinky.tstl.utilityPairMod.Pair[First, Second] {
    /**
      * Initializer Constructor.
      *
      * @param first The first element.
      * @param second The second element.
      */
    def this(first: First, second: Second) = this()
  }
  
  val pair: Instantiable2[
    /* import warning: RewrittenClass.unapply cls was tparam First */ /* first */ js.Any, 
    /* import warning: RewrittenClass.unapply cls was tparam Second */ /* second */ js.Any, 
    typingsSlinky.tstl.utilityPairMod.Pair[js.Object, js.Object]
  ] = js.native
  def is_node(): Boolean = js.native
  def make_pair[First, Second](first: First, second: Second): typingsSlinky.tstl.utilityPairMod.Pair[First, Second] = js.native
}

