class MyQueue:
    def __init__(self):
        self.q=[0]*200
        self.f=0
        self.r=0
    def push(self, x: int) -> None:
        self.q[self.r]=x
        self.r+=1
    def pop(self) -> int:
        a=0
        if(self.empty()):
            return
        else:
            a=self.q[self.f]
            self.f+=1
            return a
    def peek(self) -> int:
        a=0
        if(self.empty()):
            return
        else:
            a=self.q[self.f]
            return a
    def empty(self) -> bool:
        if (self.f==self.r):
            self.f=0
            self.r=0
            return True
        else:
            return False
