package typingsSlinky.msnodesql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object msnodesqlMod {
  import typingsSlinky.node.eventsMod.EventEmitter

  type ErrorCallback = js.Function1[/* err */ js.Error, Unit]
  type OpenCallback = js.Function2[/* err */ js.UndefOr[js.Error], /* connection */ js.UndefOr[Connection], Unit]
  type QueryCallback[T] = js.Function3[
    /* err */ js.UndefOr[js.Error], 
    /* results */ js.UndefOr[js.Array[T]], 
    /* more */ js.UndefOr[Boolean], 
    Unit
  ]
  type QueryRawCallback = js.Function3[
    /* err */ js.UndefOr[js.Error], 
    /* results */ js.UndefOr[QueryRawResult], 
    /* more */ js.UndefOr[Boolean], 
    Unit
  ]
  type StreamEvents = EventEmitter
}
