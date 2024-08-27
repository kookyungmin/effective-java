package net.happykoo.effective.part2.item2;

public abstract class Person {
    private String name;
    private String address;
    private int age;
    private int money;

    abstract static class builder<T extends builder<T>> {
        private String name;
        private int age;
        private String address;

        public T name(String name) {
            this.name = name;
            return self();
        }

        public T age(int age) {
            this.age = age;
            return self();
        }

        public T address(String address) {
            this.address = address;
            return self();
        }

        abstract Person build();
        //하위클래스는 해당 메서드를 재정의하여 자신을 반환하게 해야함
        protected abstract T self();
    }

    protected Person(builder<?> bdr) {
        this.name = bdr.name;
        this.age = bdr.age;
        this.address = bdr.address;
    }
}
