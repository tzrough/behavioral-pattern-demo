## 1. 概述


## 2. 定义

状态模式(State Pattern)：  
允许一个对象在其内部状态改变时改变它的行为，对象看起来似乎修改了它的类。  
其别名为状态对象(Objects for States)。

## 3. 适用场景

对象有多种状态，且需要相互转换、

## 4. 设计要点

状态模式包含3类角色，与策略模式类似

- 环境类(Context)  
  拥有多种状态的对象。
  
- 抽象状态类(State)
  多种状态的抽象类。
  
- 具体状态类(Concrete State)
  对象具体的状态。    


对象状态的改变可以由

- 具体状态类
  由具体状态类负责状态流转，每个具体状态类只负责和它相关联的状态，无全局视角，条件分支少。

- 环境类  
  由环境类负责状态流转，环境类需要负责全部状态的流转，有全局的视角，条件分支多。

- 状态管理类
  由状态管理类负责状态流转，状态管理类需要负责全部状态的流转，有全局的视角，条件分支多。

来维护。


## 5. 优点



## 6. 缺点