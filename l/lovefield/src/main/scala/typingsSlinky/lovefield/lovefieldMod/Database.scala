package typingsSlinky.lovefield.lovefieldMod

import typingsSlinky.lovefield.lovefieldMod.query.Delete
import typingsSlinky.lovefield.lovefieldMod.query.Insert
import typingsSlinky.lovefield.lovefieldMod.query.Select
import typingsSlinky.lovefield.lovefieldMod.query.Update
import typingsSlinky.lovefield.lovefieldMod.schema.Column
import typingsSlinky.lovefield.lovefieldMod.schema.Table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database extends js.Object {
  def close(): Unit = js.native
  def createTransaction(): Transaction = js.native
  def createTransaction(`type`: TransactionType): Transaction = js.native
  def delete(): Delete = js.native
  def export(): js.Promise[js.Object] = js.native
  def getSchema(): typingsSlinky.lovefield.lovefieldMod.schema.Database = js.native
  def `import`(data: js.Object): js.Promise[Unit] = js.native
  def insert(): Insert = js.native
  def insertOrReplace(): Insert = js.native
  def observe(query: Select, callback: js.Function): Unit = js.native
  def select(columns: Column*): Select = js.native
  def unobserve(query: Select, callback: js.Function): Unit = js.native
  def update(table: Table): Update = js.native
}

