package typingsSlinky.atPulumiKubernetes

import typingsSlinky.atPulumiKubernetes.atPulumiKubernetesStrings.extensionsSlashv1beta1
import typingsSlinky.atPulumiKubernetes.typesOutputMod.extensions.v1beta1.Deployment
import typingsSlinky.atPulumiKubernetes.typesOutputMod.meta.v1.ListMeta
import typingsSlinky.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.outputMod.Output
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/extensions/v1beta1/DeploymentList", JSImport.Namespace)
@js.native
object extensionsV1beta1DeploymentListMod extends js.Object {
  @js.native
  class DeploymentList protected () extends CustomResource {
    /**
      * Create a extensions.v1beta1.DeploymentList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(
      name: String,
      args: typingsSlinky.atPulumiKubernetes.typesInputMod.extensions.v1beta1.DeploymentList
    ) = this()
    def this(
      name: String,
      args: typingsSlinky.atPulumiKubernetes.typesInputMod.extensions.v1beta1.DeploymentList,
      opts: CustomResourceOptions
    ) = this()
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should
      * convert recognized schemas to the latest internal value, and may reject unrecognized
      * values. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output[extensionsSlashv1beta1] = js.native
    /**
      * Items is the list of Deployments.
      */
    val items: Output[js.Array[Deployment]] = js.native
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may
      * infer this from the endpoint the client submits requests to. Cannot be updated. In
      * CamelCase. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output[typingsSlinky.atPulumiKubernetes.atPulumiKubernetesStrings.DeploymentList] = js.native
    /**
      * Standard list metadata.
      */
    val metadata: Output[ListMeta] = js.native
  }
  
  /* static members */
  @js.native
  object DeploymentList extends js.Object {
    /**
      * Get the state of an existing `DeploymentList` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): DeploymentList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): DeploymentList = js.native
    /**
      * Returns true if the given object is an instance of DeploymentList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/DeploymentList.DeploymentList */ Boolean = js.native
  }
  
}

