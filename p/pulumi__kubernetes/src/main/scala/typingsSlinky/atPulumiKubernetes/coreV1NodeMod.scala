package typingsSlinky.atPulumiKubernetes

import typingsSlinky.atPulumiKubernetes.atPulumiKubernetesStrings.v1
import typingsSlinky.atPulumiKubernetes.typesOutputMod.core.v1.NodeSpec
import typingsSlinky.atPulumiKubernetes.typesOutputMod.core.v1.NodeStatus
import typingsSlinky.atPulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import typingsSlinky.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.outputMod.Output
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/core/v1/Node", JSImport.Namespace)
@js.native
object coreV1NodeMod extends js.Object {
  @js.native
  class Node protected () extends CustomResource {
    /**
      * Create a core.v1.Node resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typingsSlinky.atPulumiKubernetes.typesInputMod.core.v1.Node) = this()
    def this(
      name: String,
      args: typingsSlinky.atPulumiKubernetes.typesInputMod.core.v1.Node,
      opts: CustomResourceOptions
    ) = this()
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should
      * convert recognized schemas to the latest internal value, and may reject unrecognized
      * values. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output[v1] = js.native
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may
      * infer this from the endpoint the client submits requests to. Cannot be updated. In
      * CamelCase. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output[typingsSlinky.atPulumiKubernetes.atPulumiKubernetesStrings.Node] = js.native
    /**
      * Standard object's metadata. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: Output[ObjectMeta] = js.native
    /**
      * Spec defines the behavior of a node.
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
      */
    val spec: Output[NodeSpec] = js.native
    /**
      * Most recently observed status of the node. Populated by the system. Read-only. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
      */
    val status: Output[NodeStatus] = js.native
  }
  
  /* static members */
  @js.native
  object Node extends js.Object {
    /**
      * Get the state of an existing `Node` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): Node = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): Node = js.native
    /**
      * Returns true if the given object is an instance of Node.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/core/v1/Node.Node */ Boolean = js.native
  }
  
}

