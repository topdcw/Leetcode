# Implement Queue using Stacks

class MyQueue:

    def __init__(self):
        self.data=[]
        """
        Initialize your data structure here.
        """

    def push(self, x):
        self.data.append(x)
        """
        Push element x to the back of queue.
        :type x: int
        :rtype: void
        """

    def pop(self):
        x=self.data[0]
        del self.data[0]
        return x
        """
        Removes the element from in front of queue and returns that element.
        :rtype: int
        """

    def peek(self):
        return self.data[0]
        """
        Get the front element.
        :rtype: int
        """

    def empty(self):
        if len(self.data)==0:
            return True
        else:
            return False
        """
        Returns whether the queue is empty.
        :rtype: bool
        """

# Your MyQueue object will be instantiated and called as such:
# obj = MyQueue()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.peek()
# param_4 = obj.empty()