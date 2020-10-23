public class OuterClass {
    private static int StaticFieldPrivate;
    public static int StaticFieldPublic;
    private int fieldPrivate;
    public int fieldPublic;

    private static String staticMethod(){
        return "Hello from OuterClass.staticMethod;";
    }

    private String privateMethod(){
        InnerClass innerClass = new InnerClass();
        return "Hello from OuterClass.privateMethod [" + innerClass.method() + "]";
    }

    public String publicMethod(){
        return "Hello from OuterClass.publicMethod [" + fromStaticClass() + "]";
    }

    private String fromStaticClass(){
        StaticClass staticClass = new StaticClass();
        String str1 = "Hello from OuterClass.fromStaticClass [" + staticClass.method() + staticClass.privateFieldStaticClass + "]";
        return str1;
    }

    public String methodWithClass(){
        String myField = "Hello from OuterClass.methodWithClass.myField [" + privateMethod() + "]";
        class LocalClass{
            public String methodLocalClass(){
                return "Hello from LocalClass.methodLocalClass [" + myField + "]";
            }
        }
        LocalClass localClass = new LocalClass();
        return "Hello from OuterClass.methodWithClass [" + localClass.methodLocalClass() + "]";
    }

    private String methodAnonimous(AnonymousClass anonymousClass){
        return "Hello from OuterClass.methodAnonimous [" + anonymousClass.methodAnonimous() + "]";
    }

    public String startCollectMessage(){
        String str1 = methodAnonimous(new AnonymousClass() {
            @Override
            public String methodAnonimous() {
                return "Hello from Anonimous.methodAnonimous";
            }
        });
        return "Hello from OuterClass.startCollectMesssage [" + str1 + "][" + publicMethod() + "][" + methodWithClass() + "]";
    }

    interface AnonymousClass{
        String methodAnonimous();
    }

    static class StaticClass{
        private String privateFieldStaticClass = "Hello from StaticClass.privateFieldStaticClass;";
        private static String PrivateStaticFieldStaticClass;

        private String method(){
            String str1 = "Hello from StaticClass.method [" + staticMethod() + "]";
            return str1;
        }
    }

    class InnerClass{
        private String privateFieldInnerClass;

        private String method(){
            int i = OuterClass.StaticFieldPrivate;
            return "Hello from InnerClass.method [" + OuterClass.this.fromStaticClass() + "]";
        }
    }

}
