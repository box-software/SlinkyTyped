package typingsSlinky.cassandraDashDriver.cassandraDashDriverMod

import typingsSlinky.cassandraDashDriver.Anon_ParamsQuery
import typingsSlinky.cassandraDashDriver.libMetadataMod.metadata.ClientState
import typingsSlinky.cassandraDashDriver.libMetadataMod.metadata.Metadata
import typingsSlinky.cassandraDashDriver.libMetricsMod.metrics.ClientMetrics
import typingsSlinky.cassandraDashDriver.libTypesMod.types.ResultSet
import typingsSlinky.cassandraDashDriver.libTypesMod.types.Row
import typingsSlinky.node.Buffer
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "Client")
@js.native
class Client protected () extends EventEmitter {
  def this(options: ClientOptions) = this()
  var hosts: HostMap = js.native
  var keyspace: String = js.native
  var metadata: Metadata = js.native
  var metrics: ClientMetrics = js.native
  def batch(queries: js.Array[String | Anon_ParamsQuery]): js.Promise[ResultSet] = js.native
  def batch(queries: js.Array[String | Anon_ParamsQuery], callback: ValueCallback[ResultSet]): Unit = js.native
  def batch(queries: js.Array[String | Anon_ParamsQuery], options: QueryOptions): js.Promise[ResultSet] = js.native
  def batch(
    queries: js.Array[String | Anon_ParamsQuery],
    options: QueryOptions,
    callback: ValueCallback[ResultSet]
  ): Unit = js.native
  def connect(): js.Promise[Unit] = js.native
  def connect(callback: EmptyCallback): Unit = js.native
  def eachRow(
    query: String,
    params: ArrayOrObject,
    options: QueryOptions,
    rowCallback: js.Function2[/* n */ Double, /* row */ Row, Unit]
  ): Unit = js.native
  def eachRow(
    query: String,
    params: ArrayOrObject,
    options: QueryOptions,
    rowCallback: js.Function2[/* n */ Double, /* row */ Row, Unit],
    callback: ValueCallback[ResultSet]
  ): Unit = js.native
  def eachRow(
    query: String,
    params: ArrayOrObject,
    rowCallback: js.Function2[/* n */ Double, /* row */ Row, Unit]
  ): Unit = js.native
  def eachRow(
    query: String,
    params: ArrayOrObject,
    rowCallback: js.Function2[/* n */ Double, /* row */ Row, Unit],
    callback: ValueCallback[ResultSet]
  ): Unit = js.native
  def eachRow(query: String, rowCallback: js.Function2[/* n */ Double, /* row */ Row, Unit]): Unit = js.native
  def execute(query: String): js.Promise[ResultSet] = js.native
  def execute(query: String, callback: ValueCallback[ResultSet]): Unit = js.native
  def execute(query: String, params: ArrayOrObject): js.Promise[ResultSet] = js.native
  def execute(query: String, params: ArrayOrObject, callback: ValueCallback[ResultSet]): Unit = js.native
  def execute(query: String, params: ArrayOrObject, options: QueryOptions): js.Promise[ResultSet] = js.native
  def execute(query: String, params: ArrayOrObject, options: QueryOptions, callback: ValueCallback[ResultSet]): Unit = js.native
  def getReplicas(keyspace: String, token: Buffer): js.Array[Host] = js.native
  def getState(): ClientState = js.native
  def shutdown(): js.Promise[Unit] = js.native
  def shutdown(callback: EmptyCallback): Unit = js.native
  def stream(query: String): EventEmitter = js.native
  def stream(query: String, params: ArrayOrObject): EventEmitter = js.native
  def stream(query: String, params: ArrayOrObject, options: QueryOptions): EventEmitter = js.native
  def stream(query: String, params: ArrayOrObject, options: QueryOptions, callback: EmptyCallback): EventEmitter = js.native
}

