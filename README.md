# 객체지향 개발 5대 원리: Solid 원칙
> 객체 지향 프로그래밍을 하면서 지켜야하는 5대 원칙

각각 SRP(단일 책임 원칙), OCP(개방-폐쇄 원칙), LSP(리스코프 치환 원칙), DIP(의존 역전 원칙), ISP(인터페이스 분리 원칙)의 앞글자를 따서 만들어졌다. 

SOLID 원칙을 철저히 지키면 변경이 용이하고, 유지보수와 확장이 쉬운 소프트웨어를 개발하는데 도움이 되는 것으로 알려져있다.

> 🐣 해당 프로젝트에서는 각각의 원칙에 대해 위배된 코드를 생각해보고 위배된 코드를 해결해보는 시간을 가져보고자 한다.  

## SRP(단일 책임의 원칙, Single Responsibility Principle)
> 클래스(객체)는 단 하나의 책임만 가져야 한다는 원칙
- [SRP 위배된 코드](src/main/java/srp/before)
- [SRP 적용한 코드](src/main/java/srp/after)

## OCP(개방 폐쇄 원칙, Open-Closed Principle)
> 확장에 대해 열려있고 수정에 대해서는 닫혀있어야 한다는 원칙
- [OCP 위배된 코드](src/main/java/ocp/before)
- [OCP 적용한 코드](src/main/java/ocp/after)

## LSP(리스코프 치환 원칙, Liskov Substitution Principle)
> 서브 타입은 언제나 기반(부모) 타입으로 교체할 수 있어야 한다는 원칙
- [LSP 위배된 코드](src/main/java/lsp/before)
- [LSP 적용한 코드](src/main/java/lsp/after)

## ISP(인터페이스 분리 원칙, Interface segregation principle)
> 인터페이스를 각각 사용에 맞게 끔 잘게 분리해야한다는 설계 원칙
- [ISP 위배된 코드](src/main/java/isp/before)
- [ISP 적용한 코드](src/main/java/isp/after)

## DIP(의존 역전 원칙, Dependency Inversion Principle)
> 어떤 Class를 참조해서 사용해야하는 상황이 생긴다면, 그 Class를 직접 참조하는 것이 아니라 그 대상의 상위 요소(추상 클래스 or 인터페이스)로 참조하라는 원칙
- [DIP 위배된 코드](src/main/java/dip/before)
- [DIP 적용한 코드](src/main/java/dip/after)
