package typingsSlinky.ethereumjsDashTx

import typingsSlinky.ethereumjsDashTx.distTypesMod.BufferLike
import typingsSlinky.ethereumjsDashTx.distTypesMod.FakeTxData
import typingsSlinky.ethereumjsDashTx.distTypesMod.PrefixedHexString
import typingsSlinky.ethereumjsDashTx.distTypesMod.TransactionOptions
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethereumjs-tx/dist/fake", JSImport.Namespace)
@js.native
object distFakeMod extends js.Object {
  @js.native
  trait FakeTransaction
    extends typingsSlinky.ethereumjsDashTx.distTransactionMod.default {
    /**
      * Set from address to bypass transaction signing.
      * This is not an optional property, as its getter never returns undefined.
      */
    var from: Buffer = js.native
  }
  
  @js.native
  class default () extends FakeTransaction {
    def this(data: js.Array[BufferLike]) = this()
    def this(data: FakeTxData) = this()
    def this(data: PrefixedHexString) = this()
    def this(data: Buffer) = this()
    def this(data: js.Array[BufferLike], opts: TransactionOptions) = this()
    def this(data: FakeTxData, opts: TransactionOptions) = this()
    def this(data: PrefixedHexString, opts: TransactionOptions) = this()
    def this(data: Buffer, opts: TransactionOptions) = this()
  }
  
}

