package typingsSlinky.sqlite3DashPromise.sqlite3DashPromiseMod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sqlite3-promise", "cached")
@js.native
object cached extends js.Object {
  def Database(filename: String): typingsSlinky.sqlite3.sqlite3Mod.Database = js.native
  def Database(
    filename: String,
    callback: js.ThisFunction1[/* this */ typingsSlinky.sqlite3.sqlite3Mod.Database, /* err */ Error | Null, Unit]
  ): typingsSlinky.sqlite3.sqlite3Mod.Database = js.native
  def Database(filename: String, mode: Double): typingsSlinky.sqlite3.sqlite3Mod.Database = js.native
  def Database(
    filename: String,
    mode: Double,
    callback: js.ThisFunction1[
      /* this */ typingsSlinky.sqlite3.sqlite3Mod.Database, 
      /* err */ js.Error | Null, 
      Unit
    ]
  ): typingsSlinky.sqlite3.sqlite3Mod.Database = js.native
}

