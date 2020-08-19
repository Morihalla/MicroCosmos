package ElementaryParticles.Fermions.Quarks;

import IntrinsicProperties.ElectricCharge;
import IntrinsicProperties.SpinVector;

public abstract class Quark {
ElectricCharge electricCharge;
double electricChargeValue;

long mass;
String colorCharge;

double Spin = 0.5;
SpinVector spinVector;

Generation generation;
}
