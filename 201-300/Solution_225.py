#Implement Stack using Queues
class MyStack:

    def __init__(self):
        self.data=[]
        """
        Initialize your data structure here.
        """

    def push(self, x):
        self.data.append(x)
        """
        Push element x onto stack.
        :type x: int
        :rtype: void
        """

    def pop(self):
        x=self.data[-1]
        del self.data[-1]
        return  x
        """
        Removes the element on top of the stack and returns that element.
        :rtype: int
        """

    def top(self):
        return self.data[-1]
        """
        Get the top element.
        :rtype: int
        """

    def empty(self):
        if len(self.data)==0:
            return True
        else:
            return False
        """
        Returns whether the stack is empty.
        :rtype: bool
        """

# Your MyStack object will be instantiated and called as such:
# obj = MyStack()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.top()
# param_4 = obj.empty()