#include<stdio.h>
#include<stdlib.h>
struct node
{
  int data;
  struct node*left;
  struct node*right;
};
struct node*createnode(int val)
{
    struct node*node=(struct node*)malloc(sizeof(struct node));
    node->data=val;
    node->left=NULL;
    node->right=NULL;
    return(node);
};
void preorder(struct node*root)
{
    if(root==NULL)
    {
        return;
    }
    preorder(root->left);
    preorder(root->right);
    printf(" %d",root->data);
}
int main()
{
    struct node*root;
    root=createnode(4);
    root->left=createnode(5);
    root->right=createnode(10);
    root->left->left=createnode(7);
    root->left->right=createnode(8);
    root->right->right=createnode(1);
    printf("preorder is :");
    preorder(root);
}
