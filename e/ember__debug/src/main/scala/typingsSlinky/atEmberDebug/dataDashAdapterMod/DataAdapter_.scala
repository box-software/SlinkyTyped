package typingsSlinky.atEmberDebug.dataDashAdapterMod

import typingsSlinky.atEmberDebug.dataDashAdapterMod.DataAdapter.Column
import typingsSlinky.atEmberDebug.dataDashAdapterMod.DataAdapter.WrappedRecord
import typingsSlinky.atEmberDebug.dataDashAdapterMod.DataAdapter.WrappedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("DataAdapter")
@js.native
trait DataAdapter_
  extends typingsSlinky.atEmberObject.atEmberObjectMod.default {
  /**
    * Ember Data > v1.0.0-beta.18
    * requires string model names to be passed
    * around instead of the actual factories.
    */
  var acceptsModelName: Boolean = js.native
  /**
    * The container-debug-adapter which is used
    * to list all models.
    */
  var containerDebugAdapter: typingsSlinky.atEmberDebug.containerDashDebugDashAdapterMod.default = js.native
  /**
    * Specifies how records can be filtered.
    * Records returned will need to have a `filterValues`
    * property with a key for every name in the returned array.
    */
  def getFilters(): js.Array[Column] = js.native
  /**
    * Fetch the model types and observe them for changes.
    */
  def watchModelTypes(
    typesAdded: js.Function1[/* types */ js.Array[WrappedType], Unit],
    typesUpdated: js.Function1[/* types */ js.Array[WrappedType], Unit]
  ): js.Function0[Unit] = js.native
  /**
    * Fetch the records of a given type and observe them for changes.
    */
  def watchRecords(
    modelName: String,
    recordsAdded: js.Function1[/* records */ js.Array[WrappedRecord], Unit],
    recordsUpdated: js.Function1[/* records */ js.Array[WrappedRecord], Unit],
    recordsRemoved: js.Function2[/* idx */ Double, /* count */ Double, Unit]
  ): js.Function0[Unit] = js.native
}

