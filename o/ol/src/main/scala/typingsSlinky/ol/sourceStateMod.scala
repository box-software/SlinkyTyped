package typingsSlinky.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/source/State", JSImport.Namespace)
@js.native
object sourceStateMod extends js.Object {
  @js.native
  sealed trait State extends js.Object
  
  @js.native
  object State extends js.Object {
    @js.native
    sealed trait ERROR extends State
    
    @js.native
    sealed trait LOADING extends State
    
    @js.native
    sealed trait READY extends State
    
    @js.native
    sealed trait UNDEFINED extends State
    
  }
  
  @js.native
  object default extends js.Object {
    /* "error" */ val ERROR: typingsSlinky.ol.sourceStateMod.State.ERROR with String = js.native
    /* "loading" */ val LOADING: typingsSlinky.ol.sourceStateMod.State.LOADING with String = js.native
    /* "ready" */ val READY: typingsSlinky.ol.sourceStateMod.State.READY with String = js.native
    /* "undefined" */ val UNDEFINED: typingsSlinky.ol.sourceStateMod.State.UNDEFINED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[State with String] = js.native
  }
  
}

