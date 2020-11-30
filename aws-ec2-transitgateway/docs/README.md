# Aws::EC2::TransitGateway

Resource Type definition for AWS::EC2::TransitGateway

## Syntax

To declare this entity in your AWS CloudFormation template, use the following syntax:

### JSON

<pre>
{
    "Type" : "Aws::EC2::TransitGateway",
    "Properties" : {
        "<a href="#defaultroutetablepropagation" title="DefaultRouteTablePropagation">DefaultRouteTablePropagation</a>" : <i>String</i>,
        "<a href="#description" title="Description">Description</a>" : <i>String</i>,
        "<a href="#autoacceptsharedattachments" title="AutoAcceptSharedAttachments">AutoAcceptSharedAttachments</a>" : <i>String</i>,
        "<a href="#defaultroutetableassociation" title="DefaultRouteTableAssociation">DefaultRouteTableAssociation</a>" : <i>String</i>,
        "<a href="#vpnecmpsupport" title="VpnEcmpSupport">VpnEcmpSupport</a>" : <i>String</i>,
        "<a href="#dnssupport" title="DnsSupport">DnsSupport</a>" : <i>String</i>,
        "<a href="#multicastsupport" title="MulticastSupport">MulticastSupport</a>" : <i>String</i>,
        "<a href="#amazonsideasn" title="AmazonSideAsn">AmazonSideAsn</a>" : <i>Integer</i>,
        "<a href="#tags" title="Tags">Tags</a>" : <i>[ <a href="tag.md">Tag</a>, ... ]</i>
    }
}
</pre>

### YAML

<pre>
Type: Aws::EC2::TransitGateway
Properties:
    <a href="#defaultroutetablepropagation" title="DefaultRouteTablePropagation">DefaultRouteTablePropagation</a>: <i>String</i>
    <a href="#description" title="Description">Description</a>: <i>String</i>
    <a href="#autoacceptsharedattachments" title="AutoAcceptSharedAttachments">AutoAcceptSharedAttachments</a>: <i>String</i>
    <a href="#defaultroutetableassociation" title="DefaultRouteTableAssociation">DefaultRouteTableAssociation</a>: <i>String</i>
    <a href="#vpnecmpsupport" title="VpnEcmpSupport">VpnEcmpSupport</a>: <i>String</i>
    <a href="#dnssupport" title="DnsSupport">DnsSupport</a>: <i>String</i>
    <a href="#multicastsupport" title="MulticastSupport">MulticastSupport</a>: <i>String</i>
    <a href="#amazonsideasn" title="AmazonSideAsn">AmazonSideAsn</a>: <i>Integer</i>
    <a href="#tags" title="Tags">Tags</a>: <i>
      - <a href="tag.md">Tag</a></i>
</pre>

## Properties

#### DefaultRouteTablePropagation

_Required_: No

_Type_: String

_Update requires_: [Replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)

#### Description

_Required_: No

_Type_: String

_Update requires_: [Replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)

#### AutoAcceptSharedAttachments

_Required_: No

_Type_: String

_Update requires_: [Replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)

#### DefaultRouteTableAssociation

_Required_: No

_Type_: String

_Update requires_: [Replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)

#### VpnEcmpSupport

_Required_: No

_Type_: String

_Update requires_: [Replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)

#### DnsSupport

_Required_: No

_Type_: String

_Update requires_: [Replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)

#### MulticastSupport

_Required_: No

_Type_: String

_Update requires_: [Replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)

#### AmazonSideAsn

_Required_: No

_Type_: Integer

_Update requires_: [Replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)

#### Tags

_Required_: No

_Type_: List of <a href="tag.md">Tag</a>

_Update requires_: [Replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)

## Return Values

### Ref

When you pass the logical ID of this resource to the intrinsic `Ref` function, Ref returns the Id.

### Fn::GetAtt

The `Fn::GetAtt` intrinsic function returns a value for a specified attribute of this type. The following are the available attributes and sample return values.

For more information about using the `Fn::GetAtt` intrinsic function, see [Fn::GetAtt](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-getatt.html).

#### Id

Returns the <code>Id</code> value.