package typingsSlinky.tediousDashConnectionDashPool

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tediousDashConnectionDashPoolMod {
  /**
    * Provides a connection or an error
    * @param err error if any
    * @param connection issued from the pool
    */
  type ConnectionCallback = js.Function2[/* err */ js.Error, /* connection */ PooledConnection, Unit]
}
