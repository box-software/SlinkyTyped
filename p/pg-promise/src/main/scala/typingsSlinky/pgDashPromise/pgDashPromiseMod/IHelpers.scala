package typingsSlinky.pgDashPromise.pgDashPromiseMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.pgDashPromise.Anon_EmptyUpdate
import typingsSlinky.pgDashPromise.Anon_OptionsQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Query Formatting Helpers
// API: http://vitaly-t.github.io/pg-promise/helpers.html
@js.native
trait IHelpers extends js.Object {
  var Column: Instantiable1[
    /* col */ String | IColumnConfig, 
    typingsSlinky.pgDashPromise.pgDashPromiseMod.Column
  ] = js.native
  var ColumnSet: Instantiable2[
    /* columns */ Column, 
    js.UndefOr[/* options */ IColumnSetOptions], 
    typingsSlinky.pgDashPromise.pgDashPromiseMod.ColumnSet
  ] = js.native
  var TableName: Instantiable1[
    /* table */ String | ITable, 
    typingsSlinky.pgDashPromise.pgDashPromiseMod.TableName
  ] = js.native
  def concat(queries: js.Array[String | QueryFile | Anon_OptionsQuery]): String = js.native
  def insert(data: js.Array[js.Object]): String = js.native
  def insert(data: js.Array[js.Object], columns: QueryColumns): String = js.native
  def insert(data: js.Array[js.Object], columns: QueryColumns, table: String): String = js.native
  def insert(data: js.Array[js.Object], columns: QueryColumns, table: ITable): String = js.native
  def insert(data: js.Array[js.Object], columns: QueryColumns, table: TableName): String = js.native
  def insert(data: js.Object): String = js.native
  def insert(data: js.Object, columns: QueryColumns): String = js.native
  def insert(data: js.Object, columns: QueryColumns, table: String): String = js.native
  def insert(data: js.Object, columns: QueryColumns, table: ITable): String = js.native
  def insert(data: js.Object, columns: QueryColumns, table: TableName): String = js.native
  def sets(data: js.Object): String = js.native
  def sets(data: js.Object, columns: QueryColumns): String = js.native
  def update(data: js.Array[js.Object]): js.Any = js.native
  def update(data: js.Array[js.Object], columns: QueryColumns): js.Any = js.native
  def update(data: js.Array[js.Object], columns: QueryColumns, table: String): js.Any = js.native
  def update(data: js.Array[js.Object], columns: QueryColumns, table: String, options: Anon_EmptyUpdate): js.Any = js.native
  def update(data: js.Array[js.Object], columns: QueryColumns, table: ITable): js.Any = js.native
  def update(data: js.Array[js.Object], columns: QueryColumns, table: ITable, options: Anon_EmptyUpdate): js.Any = js.native
  def update(data: js.Array[js.Object], columns: QueryColumns, table: TableName): js.Any = js.native
  def update(data: js.Array[js.Object], columns: QueryColumns, table: TableName, options: Anon_EmptyUpdate): js.Any = js.native
  def update(data: js.Object): js.Any = js.native
  def update(data: js.Object, columns: QueryColumns): js.Any = js.native
  def update(data: js.Object, columns: QueryColumns, table: String): js.Any = js.native
  def update(data: js.Object, columns: QueryColumns, table: String, options: Anon_EmptyUpdate): js.Any = js.native
  def update(data: js.Object, columns: QueryColumns, table: ITable): js.Any = js.native
  def update(data: js.Object, columns: QueryColumns, table: ITable, options: Anon_EmptyUpdate): js.Any = js.native
  def update(data: js.Object, columns: QueryColumns, table: TableName): js.Any = js.native
  def update(data: js.Object, columns: QueryColumns, table: TableName, options: Anon_EmptyUpdate): js.Any = js.native
  def values(data: js.Array[js.Object]): String = js.native
  def values(data: js.Array[js.Object], columns: QueryColumns): String = js.native
  def values(data: js.Object): String = js.native
  def values(data: js.Object, columns: QueryColumns): String = js.native
}

