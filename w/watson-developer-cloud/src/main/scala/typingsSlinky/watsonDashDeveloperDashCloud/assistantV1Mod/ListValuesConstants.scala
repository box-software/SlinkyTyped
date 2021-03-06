package typingsSlinky.watsonDashDeveloperDashCloud.assistantV1Mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `listValues` operation. */
@JSImport("watson-developer-cloud/assistant/v1", "ListValuesConstants")
@js.native
object ListValuesConstants extends js.Object {
  @js.native
  sealed trait Sort extends js.Object
  
  /** The attribute by which returned entity values will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
  @js.native
  object Sort extends js.Object {
    @js.native
    sealed trait UPDATED extends Sort
    
    @js.native
    sealed trait VALUE extends Sort
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Sort with String] = js.native
    /* "updated" */ @js.native
    object UPDATED extends TopLevel[UPDATED with String]
    
    /* "value" */ @js.native
    object VALUE extends TopLevel[VALUE with String]
    
  }
  
}

