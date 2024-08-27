package net.happykoo.effective.part2.item2;

public class Developer extends Person {
    public enum Level { JUNIOR, INTERMEDIATE, SENIOR, PRINCIPAL }
    private Level level;
    public static class builder extends Person.builder<builder> {
        private Level level;

        public builder level(Level level) {
            this.level = level;
            return this;
        }

        @Override
        public Developer build() {
            return new Developer(this);
        }

        @Override
        protected builder self() {
            return this;
        }
    }

    private Developer(builder bdr) {
        super(bdr);
        this.level = bdr.level;
    }
}
