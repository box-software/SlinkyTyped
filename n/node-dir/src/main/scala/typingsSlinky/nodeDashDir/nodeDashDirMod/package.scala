package typingsSlinky.nodeDashDir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashDirMod {
  import typingsSlinky.node.Buffer
  import typingsSlinky.node.fsMod.ReadStream

  type FileCallback = js.Function3[/* error */ js.Any, /* content */ String | Buffer, /* next */ js.Function0[Unit], Unit]
  type FileNamedCallback = js.Function4[
    /* error */ js.Any, 
    /* content */ String | Buffer, 
    /* filename */ String, 
    /* next */ js.Function0[Unit], 
    Unit
  ]
  type FinishedCallback = js.Function2[/* error */ js.Any, /* files */ js.Array[String], Unit]
  type StreamCallback = js.Function3[/* error */ js.Any, /* stream */ ReadStream, /* next */ js.Function0[Unit], Unit]
}
