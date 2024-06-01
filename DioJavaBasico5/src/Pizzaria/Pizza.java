package Pizzaria;
public class Pizza {
    private String massa;
    private String molho;
    private String recheio;
    private boolean queijoExtra;

    private Pizza(Builder builder) {
        this.massa = builder.massa;
        this.molho = builder.molho;
        this.recheio = builder.recheio;
        this.queijoExtra = builder.queijoExtra;
    }

    public static class Builder {
        private String massa;
        private String molho;
        private String recheio;
        private boolean queijoExtra;

        public Builder massa(String massa) {
            this.massa = massa;
            return this;
        }

        public Builder molho(String molho) {
            this.molho = molho;
            return this;
        }

        public Builder recheio(String recheio) {
            this.recheio = recheio;
            return this;
        }

        public Builder queijoExtra(boolean queijoExtra) {
            this.queijoExtra = queijoExtra;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    @Override
    public String toString() {
        return "Pizza [massa=" + massa + ", molho=" + molho + ", recheio=" + recheio + ", queijoExtra=" + queijoExtra + "]";
    }
}
