public class circlecalulater {

        public static void main(String[] args) {
                // 1. declare variable circleRadius, assign the value of 12.0

                // 2. declare variable circleDiameter, calculate circleDiameter = 2 * circleRadius

                // 3. Print circle diameter

                // 4. declare variable circleArea, calculate circleArea = 3.14 * circleRadius * circleRadius

                // 5. Print circle area

                // 6. declare variable circleCircumference, calculate circleCircumference = 2 * 3.14 * circleRadius

                // 7. Print circle circumference

                double radius = 12.0;

                double area = Math.PI * (radius * radius);
                System.out.println("circle area=" + area);
                double cirmumference=  ( Math.PI *2 * radius);
                System.out.println("circle cirmumference=" + cirmumference);
                double dimeter= ( 2* radius);
                System.out.println("circle dimeter=" + dimeter);

        }
        }
