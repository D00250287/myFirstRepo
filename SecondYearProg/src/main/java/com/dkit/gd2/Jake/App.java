package com.dkit.gd2.Jake;

/**
 * Hello world!
 *
 */
    public class App
    {
        public static void main( String[] args )
        {
            int myMaxValue = Integer.MAX_VALUE;
            int myMinValue = Integer.MIN_VALUE;

            System.out.println(myMaxValue);
            System.out.println(myMinValue);

            playWithInts();

            playWithBytes();

            playWithLong();

            convertPoundToKg(200);

            playWithChar();

            nightClubEntry(21);

        }

        private static void nightClubEntry(int age)
        {
            boolean canEnter = false;
            int ENTRYAGE = 21;
            if (age>=ENTRYAGE)
            {
                canEnter=true;
                System.out.println("Welcome");
            }
            else
            {
                System.out.println("Too younf to enter");
            }

            System.out.println(canEnter);
            System.out.println();
        }

        private static void playWithChar()
        {
            char myChar = 'D';
            char muUnicodeChar = '\u0044';
            System.out.println(myChar);
            System.out.println(muUnicodeChar);
            System.out.println();
        }

        private static void convertPoundToKg(double weightInPounds)
        {
            double LBS_TO_KG_RATIO = 0.45359237;
            double weightInKilos = weightInPounds * LBS_TO_KG_RATIO;

            System.out.printf("%.1f Pound is %.1f Kilos", weightInPounds,weightInKilos);
            System.out.println();
        }

        private static void playWithLong()
        {
            long myMinLongValue = Long.MIN_VALUE;
            long myMaxLongValue = Long.MAX_VALUE;

            System.out.println(myMinLongValue);
            System.out.println(myMaxLongValue);
            System.out.println();



        }

        private static void playWithBytes()
        {
            byte myMinByteValue = Byte.MIN_VALUE;
            byte myMaxByteValue = Byte.MIN_VALUE;
            System.out.println();

        }

        private static void playWithInts()
        {
            int myMaxValue = Integer.MAX_VALUE;
            int myMinValue = Integer.MIN_VALUE;

            System.out.println("Max int value is: " + myMaxValue);
            System.out.println("Min int value is: " + myMinValue);

            System.out.println(myMaxValue+1);
            System.out.println();

        }
    }

