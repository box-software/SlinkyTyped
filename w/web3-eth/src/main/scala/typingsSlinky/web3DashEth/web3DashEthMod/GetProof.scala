package typingsSlinky.web3DashEth.web3DashEthMod

import typingsSlinky.web3DashEth.Anon_AccountProof
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetProof extends js.Object {
  var id: Double
  var jsonrpc: String
  var result: Anon_AccountProof
}

object GetProof {
  @scala.inline
  def apply(id: Double, jsonrpc: String, result: Anon_AccountProof): GetProof = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetProof]
  }
}

