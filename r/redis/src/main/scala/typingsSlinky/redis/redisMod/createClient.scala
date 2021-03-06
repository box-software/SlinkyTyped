package typingsSlinky.redis.redisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redis", "createClient")
@js.native
object createClient extends js.Object {
  def apply(): RedisClient = js.native
  def apply(options: ClientOpts): RedisClient = js.native
  def apply(port: Double): RedisClient = js.native
  def apply(port: Double, host: String): RedisClient = js.native
  def apply(port: Double, host: String, options: ClientOpts): RedisClient = js.native
  def apply(unix_socket: String): RedisClient = js.native
  def apply(unix_socket: String, options: ClientOpts): RedisClient = js.native
}

