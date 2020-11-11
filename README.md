### utils包中的工具类

- `GetElements`

  获取界面中的各个元素，参考示意图见 `./获取元素示意图.png`

- `MoveElevator`

  将电梯元素上下移动

  参数1：通过GetElements获取的elevators数组中的elevator

  参数2：方向，true向下，false向上

  参数3：偏移，调用一次该方法元素移动的距离（为正值，方法中没有加边界判断）

  一层楼的高度：50

  ```
          for (int i = 0; i < 10; i++) {
              MoveElevator.move(GetElements.getElevators()[0], false, 10);
              Thread.sleep(1000);
          }
  ```

  



